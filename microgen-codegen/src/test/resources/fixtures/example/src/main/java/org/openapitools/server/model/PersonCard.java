package org.openapitools.server.model;

/** This is an card object for a Person derived from BaseCard. */
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
                                                       PersonCard.JSONB_PROPERTY_FIRST_NAME,
                                                       PersonCard.JSONB_PROPERTY_LAST_NAME
                                               })
@javax.json.bind.annotation.JsonbTypeAdapter(PersonCard.PersonCardJsonbTypeAdapter.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class PersonCard extends BaseCard {

    public static final String JSONB_PROPERTY_FIRST_NAME = "firstName";
    public static final String JSONB_PROPERTY_LAST_NAME = "lastName";

    @javax.json.bind.annotation.JsonbCreator
    public PersonCard() {}

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_FIRST_NAME)
    public abstract java.util.Optional<String> getFirstName();

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_LAST_NAME)
    public abstract java.util.Optional<String> getLastName();

    @javax.ws.rs.ext.Provider
    public static class PersonCardJsonbTypeAdapter
            implements javax.json.bind.adapter.JsonbAdapter<
            PersonCard, PersonCardInternalBuilder.ImmutablePersonCard> {

        @Override
        public PersonCardInternalBuilder.ImmutablePersonCard adaptToJson(PersonCard obj)
                throws Exception {
            return PersonCardInternalBuilder.ImmutablePersonCard.copyOf(obj);
        }

        @Override
        public PersonCard adaptFromJson(PersonCardInternalBuilder.ImmutablePersonCard obj)
                throws Exception {
            return obj;
        }
    }

    public static class Builder extends PersonCardInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
