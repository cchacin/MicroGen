package io.swagger.server.model;

/**
 * This is a model object that has map properties of type&#x3D;integer, type&#x3D;string, and
 * type&#x3D;&lt;model&gt;.
 */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true
)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class ModelWithMapProperties {

    /**
     * Get stringMap
     *
     * @return stringMap
     */
    @javax.json.bind.annotation.JsonbProperty("stringMap")
    public abstract java.util.Optional<java.util.Map<String, String>> getStringMap();

    /**
     * Get integerMap
     *
     * @return integerMap
     */
    @javax.json.bind.annotation.JsonbProperty("integerMap")
    public abstract java.util.Optional<java.util.Map<String, Integer>> getIntegerMap();

    /**
     * Get errorInfoMap
     *
     * @return errorInfoMap
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty("errorInfoMap")
    public abstract java.util.Optional<java.util.Map<String, ErrorInfo>> getErrorInfoMap();

    /**
     * Get errorInfoArrayMap
     *
     * @return errorInfoArrayMap
     */
    @javax.validation.Valid
    @javax.json.bind.annotation.JsonbProperty("errorInfoArrayMap")
    public abstract java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>>
    getErrorInfoArrayMap();

    public static class Builder extends ModelWithMapPropertiesInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
