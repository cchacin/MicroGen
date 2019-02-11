package io.swagger.codegen.v3.generators.java;

import io.swagger.codegen.v3.*;
import io.swagger.codegen.v3.templates.MustacheTemplateEngine;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.swagger.codegen.v3.generators.handlebars.ExtensionHelper.getBooleanValue;
import static java.util.stream.Collectors.toList;

public class MicroGen extends JavaClientCodegen {

    private final String EXCLUDED_TAGS = "excludedTags";
    private final String TAG_MAPPING = "tagMapping";

    private static final Pattern TAG_MAPPING_PATTERN = Pattern.compile("^(.+):(.*?)$");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("[, \t\r\n]+");

    protected List<Pair<Pattern, String>> tagMapping = new ArrayList<>();

    public MicroGen() {
        super();
        this.fullJavaUtil = true;
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
        this.additionalProperties.put(CodegenConstants.TEMPLATE_ENGINE, new MustacheTemplateEngine(this));
        this.setTemplateEngine();

    }

    @Override
    public CodegenOperation fromOperation(
            final String path,
            final String httpMethod,
            final Operation operation,
            final Map<String, Schema> schemas,
            final OpenAPI openAPI) {
        final CodegenOperation codegenOperation = super.fromOperation(path, httpMethod, operation, schemas, openAPI);
        return new MicroGenOperation(codegenOperation);
    }

    @Override
    public CodegenModel fromModel(final String name, final Schema schema, final Map<String, Schema> allSchemas) {
        final CodegenModel model = super.fromModel(name, schema, allSchemas);
        model.imports.clear();
        model.vars = model.vars.stream()
                .map(MicroGenProperty::new)
                .collect(toList());
        return new MicroGenModel(model);
    }

    @Override
    public void preprocessOpenAPI(final OpenAPI swagger) {
        super.preprocessOpenAPI(swagger);
        this.filterOperations(swagger, this.getExcludedTags());
        this.additionalProperties.put("apiVersion", swagger.getInfo().getVersion());
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
        this.importMapping.clear();

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
    public Map<String, Object> postProcessOperations(final Map<String, Object> objs) {
        super.postProcessOperations(objs);
        final Map<String, Object> operations = (Map<String, Object>) objs.get("operations");
        if (operations != null) {
            final List<CodegenOperation> ops = (List<CodegenOperation>) operations.get("operation");
            for (final CodegenOperation operation : ops) {
                final boolean hasConsumes = getBooleanValue(operation, CodegenConstants.HAS_CONSUMES_EXT_NAME);
                if (hasConsumes) {

                    if (Util.isMultipartType(operation.consumes)) {
                        operation.getVendorExtensions().put(CodegenConstants.IS_MULTIPART_EXT_NAME, Boolean.TRUE);
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
                        if (getBooleanValue(one, CodegenConstants.IS_PATH_PARAM_EXT_NAME)
                                && getBooleanValue(another, CodegenConstants.IS_QUERY_PARAM_EXT_NAME)) {
                            return -1;
                        }
                        if (getBooleanValue(one, CodegenConstants.IS_QUERY_PARAM_EXT_NAME)
                                && getBooleanValue(another, CodegenConstants.IS_PATH_PARAM_EXT_NAME)) {
                            return 1;
                        }

                        return 0;
                    });
                    final Iterator<CodegenParameter> iterator = operation.allParams.iterator();
                    while (iterator.hasNext()) {
                        final CodegenParameter param = iterator.next();
                        param.getVendorExtensions().put(CodegenConstants.HAS_MORE_EXT_NAME, iterator.hasNext());
                    }
                }
            }
        }
        return objs;
    }

    @Override
    public CodegenParameter fromParameter(final Parameter parameter, final Set<String> imports) {
        final CodegenParameter param = super.fromParameter(parameter, imports);
        final Schema<?> schema = parameter.getSchema();
        if (schema != null && param.getDefaultValue() == null && schema.getDefault() != null) {
            param.defaultValue = schema.getDefault().toString();
        }
        return param;
    }

    protected void filterOperations(final OpenAPI swagger,
                                    final Set<String> excludedTags) {
        final Paths swaggerPaths = swagger.getPaths();
        for (final String resourcePath : swaggerPaths.keySet()) {
            for (final Operation operation : swaggerPaths.get(resourcePath).readOperations()) {
                final List<String> tags = operation.getTags();
                operation.setTags(tags == null ? Collections.singletonList("default") : tags.stream()
                        .filter(tag -> !excludedTags
                                .contains(tag))
                        .collect(toList()));
            }
        }
        if (!this.tagMapping.isEmpty()) {
            this.mapTagsOnOperations(swagger);
        }
    }

    protected void mapTagsOnOperations(final OpenAPI swagger) {
        swagger.getPaths()
                .values()
                .stream()
                .flatMap(path -> path.readOperations().stream())
                .filter(op -> op.getTags() != null && !op.getTags().isEmpty())
                .forEach(op -> op.setTags(this.mapOperationTags(op)));
    }

    protected List<String> mapOperationTags(final Operation op) {
        return op.getTags()
                .stream()
                .map(this::mapOperationTag)
                .distinct()
                .collect(toList());
    }

    protected String mapOperationTag(final String originalTag) {
        String tag = originalTag;
        for (final Pair<Pattern, String> p : this.tagMapping) {
            final Matcher m = p.getLeft().matcher(tag);
            if (m.matches()) {
                tag = m.replaceAll(p.getRight());
            }
        }
        return tag;
    }

    protected List<Pair<Pattern, String>> parseTagMappings(final String value) {
        return WHITESPACE_PATTERN.splitAsStream(value)
                .map(StringUtils::trimToNull)
                .filter(Objects::nonNull)
                .map(this::compileTagMatchPattern)
                .collect(toList());
    }

    protected Pair<Pattern, String> compileTagMatchPattern(final String str) {
        final Matcher matcher = TAG_MAPPING_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Tag mapping pattern must be of the form pattern:replacement, but is "
                    + str);
        }
        return Pair.of(Pattern.compile("^" + matcher.group(1) + "$"), matcher.group(2));
    }

    public Set<String> getExcludedTags() {
        return (Set<String>) this.additionalProperties.get(EXCLUDED_TAGS);
    }

}
