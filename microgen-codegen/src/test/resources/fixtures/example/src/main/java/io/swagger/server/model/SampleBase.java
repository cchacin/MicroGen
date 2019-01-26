package io.swagger.server.model;

/**
 * This is an base class object from which other classes will derive.
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
public abstract class SampleBase {

    /**
     * Get baseClassStringProp
     *
     * @return baseClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
    public abstract java.util.Optional<String> getBaseClassStringProp();

    /**
     * Get baseClassIntegerProp
     *
     * @return baseClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
    public abstract java.util.Optional<Integer> getBaseClassIntegerProp();

    public static class Builder extends SampleBaseInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}
