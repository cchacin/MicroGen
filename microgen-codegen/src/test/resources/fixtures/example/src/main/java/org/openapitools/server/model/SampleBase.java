package org.openapitools.server.model;

/** This is an base class object from which other classes will derive. */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({
        SampleBase.JSONB_PROPERTY_BASE_CLASS_STRING_PROP,
        SampleBase.JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP
})
@javax.json.bind.annotation.JsonbTypeSerializer(SampleBaseSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(SampleBaseSerializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class SampleBase implements OpenAPIModel {

    public static final String JSONB_PROPERTY_BASE_CLASS_STRING_PROP = "baseClassStringProp";
    public static final String JSONB_PROPERTY_BASE_CLASS_INTEGER_PROP = "baseClassIntegerProp";

    @javax.json.bind.annotation.JsonbCreator
    public SampleBase() {}

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
    public abstract java.util.Optional<Integer> getBaseClassIntegerProp();

    public static class Builder extends ImmutableSampleBase.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
