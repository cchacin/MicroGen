package org.openapitools.server.model;

/** This is a model object that contains a property with readOnly&#x3D;true. */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({
        ModelWithReadOnlyPropertyTest.JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE,
        ModelWithReadOnlyPropertyTest.JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE,
        ModelWithReadOnlyPropertyTest.JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE
})
@javax.json.bind.annotation.JsonbTypeSerializer(ModelWithReadOnlyPropertyTestSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(ModelWithReadOnlyPropertyTestSerializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class ModelWithReadOnlyPropertyTest implements OpenAPIModel {

    public static final String JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE =
            "stringPropWithImplicitReadOnlyFalse";
    public static final String JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE =
            "stringPropWithExplicitReadOnlyFalse";
    public static final String JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE =
            "stringPropWithReadOnlyTrue";

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithReadOnlyPropertyTest() {}

    /**
     * This is a property without a readOnly attribute, meaning that it takes on the default value of
     * readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithImplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty(
            JSONB_PROPERTY_STRING_PROP_WITH_IMPLICIT_READ_ONLY_FALSE)
    public abstract java.util.Optional<String> getStringPropWithImplicitReadOnlyFalse();

    /**
     * This is a property with readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithExplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty(
            JSONB_PROPERTY_STRING_PROP_WITH_EXPLICIT_READ_ONLY_FALSE)
    public abstract java.util.Optional<String> getStringPropWithExplicitReadOnlyFalse();

    /**
     * This is a property with readOnly=true, meaning that it should be included in the response, but
     * not the request.
     *
     * @return stringPropWithReadOnlyTrue
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_STRING_PROP_WITH_READ_ONLY_TRUE)
    public abstract java.util.Optional<String> getStringPropWithReadOnlyTrue();

    public static class Builder extends ImmutableModelWithReadOnlyPropertyTest.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
