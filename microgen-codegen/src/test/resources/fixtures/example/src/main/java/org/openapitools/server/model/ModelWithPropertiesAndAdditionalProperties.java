package org.openapitools.server.model;

/** This is a model object that has properties and additionalProperties. */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbAnnotation.class,
                javax.json.bind.annotation.JsonbCreator.class,
                javax.json.bind.annotation.JsonbDateFormat.class,
                javax.json.bind.annotation.JsonbNillable.class,
                javax.json.bind.annotation.JsonbNumberFormat.class,
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbPropertyOrder.class,
                javax.json.bind.annotation.JsonbTransient.class,
                javax.json.bind.annotation.JsonbTypeAdapter.class,
                javax.json.bind.annotation.JsonbTypeSerializer.class,
                javax.json.bind.annotation.JsonbTypeDeserializer.class,
                javax.json.bind.annotation.JsonbVisibility.class
        },
        jdkOnly = true)
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       ModelWithPropertiesAndAdditionalProperties.JSONB_PROPERTY_INTEGER_PROP,
                                                       ModelWithPropertiesAndAdditionalProperties.JSONB_PROPERTY_STRING_PROP
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class ModelWithPropertiesAndAdditionalProperties
        extends java.util.HashMap<String, String> {

    public static final String JSONB_PROPERTY_INTEGER_PROP = "integerProp";
    public static final String JSONB_PROPERTY_STRING_PROP = "stringProp";

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithPropertiesAndAdditionalProperties() {}

    /**
     * Get integerProp
     *
     * @return integerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_INTEGER_PROP)
    public abstract java.util.OptionalInt getIntegerProp();

    /**
     * Get stringProp
     *
     * @return stringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_PROP)
    public abstract java.util.Optional<String> getStringProp();

    public static class Builder extends ModelWithPropertiesAndAdditionalPropertiesInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
