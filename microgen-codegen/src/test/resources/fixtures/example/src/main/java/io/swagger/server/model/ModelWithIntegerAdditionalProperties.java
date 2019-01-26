package io.swagger.server.model;

/**
 * This is a model object that has additionalProperties with type&#x3D;integer.
 */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.VALIDATION_API,
        jacksonIntegration = false,
        passAnnotations = {
                javax.json.bind.annotation.JsonbProperty.class},
        jdkOnly = true)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class ModelWithIntegerAdditionalProperties
        extends java.util.HashMap<String, Integer> {

    public static class Builder extends ModelWithIntegerAdditionalPropertiesInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
