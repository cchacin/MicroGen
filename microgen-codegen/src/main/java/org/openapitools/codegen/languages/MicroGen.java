package org.openapitools.codegen.languages;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.openapitools.codegen.CliOption;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenParameter;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.utils.ModelUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.servers.Server;

import static java.util.stream.Collectors.toList;
import static org.openapitools.codegen.utils.StringUtils.camelize;

public class MicroGen extends JavaClientCodegen {

    private static final String PREFIX_IS               = "x-is-";
    private static final String PREFIX_HAS              = "x-has-";
    private static final String HAS_MORE_EXT_NAME       = PREFIX_HAS + "more";
    private static final String HAS_CONSUMES_EXT_NAME   = PREFIX_HAS + "consumes";
    private static final String HAS_PRODUCES_EXT_NAME   = PREFIX_HAS + "produces";
    private static final String IS_QUERY_PARAM_EXT_NAME = PREFIX_IS + "query-param";
    private static final String IS_PATH_PARAM_EXT_NAME  = PREFIX_IS + "path-param";
    private static final String IS_MULTIPART_EXT_NAME   = PREFIX_IS + "multipart";

    private final String EXCLUDED_TAGS = "excludedTags";
    private final String TAG_MAPPING   = "tagMapping";

    private static final Pattern TAG_MAPPING_PATTERN = Pattern.compile("^(.+):(.*?)$");
    private static final Pattern WHITESPACE_PATTERN  = Pattern.compile("[, \t\r\n]+");

    protected List<Pair<Pattern, String>> tagMapping = new ArrayList<>();

    public MicroGen() {
        super();
        this.setTemplatingEngine(new MicroGenTemplateEngine());
        this.fullJavaUtil = true;
        this.supportingFiles.clear();
        this.supportedLibraries.clear();
        this.supportedLibraries.put("server",
                                    "JavaEE + Eclipse Micro Profile");

        this.cliOptions.clear();
        final CliOption libraryOption = new CliOption(CodegenConstants.LIBRARY,
                                                      "library template (sub-template) to use");
        libraryOption.setEnum(this.supportedLibraries);
        libraryOption.setDefault("server");
        this.cliOptions.add(libraryOption);

        this.cliOptions.add(new CliOption(CodegenConstants.MODEL_PACKAGE, CodegenConstants.MODEL_PACKAGE_DESC));
        this.cliOptions.add(new CliOption(CodegenConstants.API_PACKAGE, CodegenConstants.API_PACKAGE_DESC));
        this.cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC));
        this.cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC));
        this.cliOptions.add(CliOption.newString(EXCLUDED_TAGS, "List of tags to exclude"));
        this.cliOptions.add(CliOption.newString(TAG_MAPPING, "Regex:tagName pairs to apply to operation tags."));

        this.setLibrary("server");

        this.instantiationTypes.put("array", "java.util.List");
        this.instantiationTypes.put("map", "java.util.HashMap");
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
        return new MicroGenModel(delegate);
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
        this.supportsInheritance = true;
        this.apiDocTemplateFiles.clear();
        this.apiTestTemplateFiles.clear();
        this.apiTestTemplateFiles.put("api_test.mustache", ".java");
        this.additionalProperties.clear();

        this.instantiationTypes.put("array", Builder.JAVA_UTIL_LIST);
        this.instantiationTypes.put("map", Builder.JAVA_UTIL_HASHMAP);

        final String resourcesFolder = this.projectFolder + "/resources";
        this.supportingFiles.add(new SupportingFile("versions.mustache", resourcesFolder, "versions.properties"));

        this.additionalProperties.put(EXCLUDED_TAGS, Util.extractStringSet(this.additionalProperties, EXCLUDED_TAGS));

        if (this.additionalProperties.containsKey(TAG_MAPPING)) {
            this.tagMapping = this.parseTagMappings(String.valueOf(this.additionalProperties.get(TAG_MAPPING)));
        }

        this.typeMapping = Builder.buildTypeMapping();
    }

    @Override
    public Map<String, Object> postProcessOperationsWithModels(final Map<String, Object> objs, List<Object> allModels) {
        this.supportingFiles.clear();
        super.postProcessOperationsWithModels(objs, allModels);
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
                    operation.returnType = "Void";
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
    public String toApiName(String name) {
        if (name.length() == 0) {
            return "Default";
        }
        return camelize(name) + "";
    }

    @Override 
    public String toApiFilename(String name) {
        return toApiName(name) + "Api";
    }

    @Override
    public String toApiTestFilename(String name) {
        return toApiName(name) + "RestClient";
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
        final Schema schema = ModelUtils.getReferencedSchema(this.openAPI, p);
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
        return (Set<String>) this.additionalProperties.get(EXCLUDED_TAGS);
    }
}
