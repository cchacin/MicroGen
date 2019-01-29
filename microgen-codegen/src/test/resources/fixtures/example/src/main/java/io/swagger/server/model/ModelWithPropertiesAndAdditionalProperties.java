package io.swagger.server.model;

/** This is a model object that has properties and additionalProperties. */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbCreator.class
        },
        jdkOnly = true)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class ModelWithPropertiesAndAdditionalProperties
        extends java.util.HashMap<String, String> {

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithPropertiesAndAdditionalProperties() {}

    /**
     * Get integerProp
     *
     * @return integerProp
     */
    @javax.json.bind.annotation.JsonbProperty("integerProp")
    public abstract Integer getIntegerProp();

    /**
     * Get stringProp
     *
     * @return stringProp
     */
    @javax.json.bind.annotation.JsonbProperty("stringProp")
    public abstract String getStringProp();
}
