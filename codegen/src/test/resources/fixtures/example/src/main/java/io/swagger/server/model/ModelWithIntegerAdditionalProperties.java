package io.swagger.server.model;

/** This is a model object that has additionalProperties with type&#x3D;integer. */
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
public abstract class ModelWithIntegerAdditionalProperties extends java.util.HashMap<String, Integer> {

    public static class Builder extends ModelWithIntegerAdditionalPropertiesInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
