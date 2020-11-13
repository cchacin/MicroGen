package org.openapitools.server.model;

/** This is an card object for a Person derived from BaseCard. */
@javax.json.bind.annotation.JsonbPropertyOrder({
        PersonCard.JSONB_PROPERTY_FIRST_NAME,
        PersonCard.JSONB_PROPERTY_LAST_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class PersonCard extends BaseCard implements OpenAPIModel {

    public static final String JSONB_PROPERTY_FIRST_NAME = "firstName";
    public static final String JSONB_PROPERTY_LAST_NAME = "lastName";

    private java.util.Optional<String> firstName = java.util.Optional.empty();

    private java.util.Optional<String> lastName = java.util.Optional.empty();

    public PersonCard() {
        super();
    }

    public PersonCard(
            final java.util.Optional<String> firstName, final java.util.Optional<String> lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_FIRST_NAME)
    public java.util.Optional<String> getFirstName() {
        return firstName;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_FIRST_NAME)
    public void setFirstName(java.util.Optional<String> firstName) {
        this.firstName = firstName;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_LAST_NAME)
    public java.util.Optional<String> getLastName() {
        return lastName;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_LAST_NAME)
    public void setLastName(java.util.Optional<String> lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonCard personCard = (PersonCard) o;
        return java.util.Objects.equals(this.firstName, personCard.firstName)
                && java.util.Objects.equals(this.lastName, personCard.lastName)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonCard {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    " + JSONB_PROPERTY_FIRST_NAME + ": ")
                .append(toIndentedString(firstName))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_LAST_NAME + ": ")
                .append(toIndentedString(lastName))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static Builder builder() {
        return Builder.create();
    }

    public static final class Builder {
        private java.util.Optional<String> firstName;
        private java.util.Optional<String> lastName;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder firstName(final java.util.Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(final String firstName) {
            this.firstName = java.util.Optional.ofNullable(firstName);
            return this;
        }

        public Builder lastName(final java.util.Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(final String lastName) {
            this.lastName = java.util.Optional.ofNullable(lastName);
            return this;
        }

        public PersonCard build() {
            return new PersonCard(this.firstName, this.lastName);
        }
    }
}
