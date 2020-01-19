package org.openapitools.server.model;

/** This is an card object for a Person derived from BaseCard. */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       PersonCard.JSONB_PROPERTY_FIRST_NAME,
                                                       PersonCard.JSONB_PROPERTY_LAST_NAME
                                               })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class PersonCard extends BaseCard implements OpenAPIModel {

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

    public static class Builder extends ImmutablePersonCard.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
