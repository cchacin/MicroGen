package io.swagger.server.model;

/** This is a model object that has properties and additionalProperties. */
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
public abstract class ModelWithPropertiesAndAdditionalProperties
        extends java.util.HashMap<String, String> {

    /**
     * Get integerProp
     *
     * @return integerProp
     */
    @javax.json.bind.annotation.JsonbProperty("integerProp")
    public abstract java.util.Optional<Integer> getIntegerProp();

    /**
     * Get stringProp
     *
     * @return stringProp
     */
    @javax.json.bind.annotation.JsonbProperty("stringProp")
    public abstract java.util.Optional<String> getStringProp();

    public static class Builder extends ModelWithPropertiesAndAdditionalPropertiesInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
