package org.openapitools.server.model;

/** This is an subclass defived from the SampleBase class. */
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
                                                       SampleSubClass.JSONB_PROPERTY_BASE_CLASS_STRING_PROP,
                                                       SampleSubClass.JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP,
                                                       SampleSubClass.JSONB_PROPERTY_SUB_CLASS_STRING_PROP,
                                                       SampleSubClass.JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class SampleSubClass {

    public static final String JSONB_PROPERTY_BASE_CLASS_STRING_PROP = "baseClassStringProp";
    public static final String JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP = "baseClassIntegerProp";
    public static final String JSONB_PROPERTY_SUB_CLASS_STRING_PROP = "subClassStringProp";
    public static final String JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP = "subClassIntegerProp";

    @javax.json.bind.annotation.JsonbCreator
    public SampleSubClass() {}

    /**
     * Get baseClassStringProp
     *
     * @return baseClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_STRING_PROP)
    public abstract java.util.Optional<String> getBaseClassStringProp();

    /**
     * Get baseClassIntegerProp
     *
     * @return baseClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP)
    public abstract java.util.OptionalInt getBaseClassIntegerProp();

    /**
     * Get subClassStringProp
     *
     * @return subClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SUB_CLASS_STRING_PROP)
    public abstract java.util.Optional<String> getSubClassStringProp();

    /**
     * Get subClassIntegerProp
     *
     * @return subClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_SUB_CLASS_INTEGER_PROP)
    public abstract java.util.OptionalInt getSubClassIntegerProp();

    public static class Builder extends SampleSubClassInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
