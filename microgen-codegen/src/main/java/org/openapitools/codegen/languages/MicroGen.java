/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.openapitools.codegen.languages;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.servers.Server;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.openapitools.codegen.*;
import org.openapitools.codegen.utils.ModelUtils;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;
import static org.openapitools.codegen.utils.StringUtils.camelize;

public class MicroGen extends JavaClientCodegen {

    private static final String PREFIX_IS = "x-is-";
    private static final String PREFIX_HAS = "x-has-";
    private static final String HAS_MORE_EXT_NAME = PREFIX_HAS + "more";
    private static final String HAS_CONSUMES_EXT_NAME = PREFIX_HAS + "consumes";
    private static final String HAS_PRODUCES_EXT_NAME = PREFIX_HAS + "produces";
    private static final String IS_QUERY_PARAM_EXT_NAME = PREFIX_IS + "query-param";
    private static final String IS_PATH_PARAM_EXT_NAME = PREFIX_IS + "path-param";
    private static final String IS_MULTIPART_EXT_NAME = PREFIX_IS + "multipart";

    private final String EXCLUDED_TAGS = "excludedTags";
    private final String TAG_MAPPING = "tagMapping";

    private static final Pattern TAG_MAPPING_PATTERN = Pattern.compile("^(.+):(.*?)$");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("[, \t\r\n]+");

    protected List<Pair<Pattern, String>> tagMapping = new ArrayList<>();

    public MicroGen() {
        super();
        this.setTemplatingEngine(new MicroGenTemplateEngine());
        this.fullJavaUtil = true;
        this.supportingFiles().clear();
        this.supportedLibraries.clear();
        this.supportedLibraries.put("server",
                "JavaEE + Eclipse Micro Profile");

        this.cliOptions.clear();
        final CliOption libraryOption = new CliOption(CodegenConstants.LIBRARY,
                "library template (sub-template) to use");
        libraryOption.setEnum(this.supportedLibraries);
        this.cliOptions.add(libraryOption);

        this.cliOptions.add(new CliOption(CodegenConstants.MODEL_PACKAGE, CodegenConstants.MODEL_PACKAGE_DESC));
        this.cliOptions.add(new CliOption(CodegenConstants.API_PACKAGE, CodegenConstants.API_PACKAGE_DESC));
        this.cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC));
        this.cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC));
        this.cliOptions.add(CliOption.newString(this.EXCLUDED_TAGS, "List of tags to exclude"));
        this.cliOptions.add(CliOption.newString(this.TAG_MAPPING, "Regex:tagName pairs to apply to operation tags."));

        this.setLibrary("server");
    }

    @Override
    public CodegenOperation fromOperation(
            final String path,
            final String httpMethod,
            final Operation operation,
            final List<Server> servers) {
        final CodegenOperation delegate = super.fromOperation(path, httpMethod, operation, servers);
        return new MicroGenOperation(delegate);
    }

    @Override
    public CodegenModel fromModel(final String name, final Schema model2) {
        final CodegenModel delegate = super.fromModel(name, model2);
        delegate.imports.clear();
        delegate.vars = delegate.vars.stream()
                .map(MicroGenProperty::new)
                .collect(toList());
        return delegate;
    }

    @Override
    public void preprocessOpenAPI(final OpenAPI openAPI) {
        super.preprocessOpenAPI(openAPI);
        this.filterOperations(openAPI, this.getExcludedTags());
        this.additionalProperties.put("apiVersion", openAPI.getInfo().getVersion());
    }

    @Override
    public void processOpts() {
        super.processOpts();
        this.importMapping.clear();
        this.supportingFiles.clear();
        this.modelDocTemplateFiles.clear();
        this.modelTemplateFiles.clear();
        this.modelTemplateFiles.put("model.mustache", ".java");
        // this.modelTemplateFiles.put("modelTypeAdapter.mustache", "TypeAdapter.java");
        this.supportsInheritance = true;
        this.apiDocTemplateFiles.clear();
        this.apiTemplateFiles.clear();
        this.apiTemplateFiles.put("api.mustache", ".java");
        this.apiTestTemplateFiles.clear();
        this.apiTestTemplateFiles.put("api_test.mustache", ".java");
        this.apiTestTemplateFiles.put("examples.mustache", "Examples.json");
        this.additionalProperties.clear();

        this.instantiationTypes.put("array", Builder.JAVA_UTIL_LIST);
        this.instantiationTypes.put("map", Builder.JAVA_UTIL_HASHMAP);

        final String resourcesFolder = this.projectFolder + File.separator + "resources";
        final String modelsFolder = this.sourceFolder + File.separator + modelPackage().replace('.',
                File.separatorChar);
        this.supportingFiles.add(new SupportingFile("versions.mustache", resourcesFolder, "versions.properties"));
        this.supportingFiles.add(new SupportingFile("openAPIModel.mustache", modelsFolder, "OpenAPIModel.java"));
        this.supportingFiles.add(new SupportingFile("modelPackageInfo.mustache", modelsFolder, "package-info.java"));

        this.additionalProperties.put(this.EXCLUDED_TAGS,
                Util.extractStringSet(this.additionalProperties, this.EXCLUDED_TAGS));

        if (this.additionalProperties.containsKey(this.TAG_MAPPING)) {
            this.tagMapping = this.parseTagMappings(String.valueOf(this.additionalProperties.get(this.TAG_MAPPING)));
        }

        this.typeMapping = Builder.buildTypeMapping();
    }

    @Override
    public Map<String, Object> postProcessOperationsWithModels(final Map<String, Object> objs,
                                                               final List<Object> allModels) {
        final Map<String, Object> operations = (Map<String, Object>) objs.get("operations");
        if (operations != null) {
            final List<CodegenOperation> ops = (List<CodegenOperation>) operations.get("operation");
            for (final CodegenOperation operation : ops) {
                if (operation.hasConsumes) {
                    if (Util.isMultipartType(operation.consumes)) {
                        operation.vendorExtensions.put(IS_MULTIPART_EXT_NAME, Boolean.TRUE);
                    } else {
                        operation.prioritizedContentTypes = prioritizeContentTypes(operation.consumes);
                    }
                }
                if (operation.returnType == null) {
                    operation.returnType = "javax.ws.rs.core.Response";
                }
                if (StringUtils.isNotEmpty(operation.path) && operation.path.charAt(0) == '/') {
                    operation.path = operation.path.substring(1);
                }

                // sorting operation parameters to make sure path params are parsed before query params
                if (operation.allParams != null) {
                    operation.allParams.sort((one, another) -> {
                        if (one.isPathParam && another.isQueryParam) {
                            return -1;
                        }
                        if (another.isPathParam && one.isQueryParam) {
                            return 1;
                        }

                        return 0;
                    });
                    final Iterator<CodegenParameter> iterator = operation.allParams.iterator();
                    while (iterator.hasNext()) {
                        final CodegenParameter param = iterator.next();
                        param.vendorExtensions.put(HAS_MORE_EXT_NAME, iterator.hasNext());
                    }
                }
            }
        }
        return objs;
    }

    @Override
    public String toApiName(final String name) {
        if (name.length() == 0) {
            return "Default";
        }
        return camelize(name) + "";
    }

    @Override
    public String toApiFilename(final String name) {
        return this.toApiName(name) + "Api";
    }

    @Override
    public String toApiTestFilename(final String name) {
        return this.toApiName(name) + "RestClient";
    }

    @Override
    public String apiTestFilename(final String templateName, final String tag) {
        final String suffix = this.apiTestTemplateFiles().get(templateName);
        if (suffix.endsWith(".json")) {
            return this.outputFolder + File.separator + this.projectTestFolder + File.separator + "resources" + File.separator + this
                    .toApiTestFilename(tag) + suffix;
        }
        return this.apiTestFileFolder() + File.separator + this.toApiTestFilename(tag) + suffix;
    }

    private void filterOperations(final OpenAPI openAPI,
                                  final Set<String> excludedTags) {
        final Paths paths = openAPI.getPaths();
        for (final String resourcePath : paths.keySet()) {
            for (final Operation operation : paths.get(resourcePath).readOperations()) {
                final List<String> tags = operation.getTags();
                operation.setTags(tags == null ? Collections.singletonList("default") : tags.stream()
                        .filter(tag -> !excludedTags
                                .contains(tag))
                        .collect(toList()));
            }
        }
        if (!this.tagMapping.isEmpty()) {
            this.mapTagsOnOperations(openAPI);
        }
    }

    @Override
    public String toDefaultValue(final Schema p) {
        final Schema<?> schema = ModelUtils.getReferencedSchema(this.openAPI, p);
        if (schema.getDefault() != null && ModelUtils.isStringSchema(schema)) {
            return schema.getDefault().toString();
        }
        return super.toDefaultValue(p);
    }

    private void mapTagsOnOperations(final OpenAPI openAPI) {
        openAPI.getPaths()
                .values()
                .stream()
                .flatMap(path -> path.readOperations().stream())
                .filter(op -> op.getTags() != null && !op.getTags().isEmpty())
                .forEach(op -> op.setTags(this.mapOperationTags(op)));
    }

    private List<String> mapOperationTags(final Operation op) {
        return op.getTags()
                .stream()
                .map(this::mapOperationTag)
                .distinct()
                .collect(toList());
    }

    private String mapOperationTag(final String originalTag) {
        String tag = originalTag;
        for (final Pair<Pattern, String> p : this.tagMapping) {
            final Matcher m = p.getLeft().matcher(tag);
            if (m.matches()) {
                tag = m.replaceAll(p.getRight());
            }
        }
        return tag;
    }

    private List<Pair<Pattern, String>> parseTagMappings(final String value) {
        return WHITESPACE_PATTERN.splitAsStream(value)
                .map(StringUtils::trimToNull)
                .filter(Objects::nonNull)
                .map(this::compileTagMatchPattern)
                .collect(toList());
    }

    private Pair<Pattern, String> compileTagMatchPattern(final String str) {
        final Matcher matcher = TAG_MAPPING_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Tag mapping pattern must be of the form pattern:replacement, but is "
                    + str);
        }
        return Pair.of(Pattern.compile("^" + matcher.group(1) + "$"), matcher.group(2));
    }

    private Set<String> getExcludedTags() {
        return (Set<String>) this.additionalProperties.get(this.EXCLUDED_TAGS);
    }
}
