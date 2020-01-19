package org.openapitools.server.model;

/** This is a model object that has properties and additionalProperties. */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       ModelWithPropertiesAndAdditionalProperties.JSONB_PROPERTY_INTEGER_PROP,
                                                       ModelWithPropertiesAndAdditionalProperties.JSONB_PROPERTY_STRING_PROP
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class ModelWithPropertiesAndAdditionalProperties
        extends java.util.HashMap<String, String> implements OpenAPIModel {

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

    public static class Builder extends ImmutableModelWithPropertiesAndAdditionalProperties.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
