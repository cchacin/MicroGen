package org.openapitools.server.model;

/**
 * This is an card object for a Person derived from BaseCard.
 */
@javax.json.bind.annotation.JsonbPropertyOrder({PersonCard.JSON_PROPERTY_FIRST_NAME,
                                                   PersonCard.JSON_PROPERTY_LAST_NAME})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class PersonCard extends BaseCard {

    private final java.util.Optional<String> firstName;
    public static final String JSON_PROPERTY_FIRST_NAME = "firstName";

    private final java.util.Optional<String> lastName;
    public static final String JSON_PROPERTY_LAST_NAME = "lastName";

    @javax.json.bind.annotation.JsonbCreator public PersonCard(
        @javax.json.bind.annotation.JsonbProperty("firstName")
        final java.util.Optional<String> firstName,
        @javax.json.bind.annotation.JsonbProperty("lastName")
        final java.util.Optional<String> lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty("firstName")
    public java.util.Optional<String> getFirstName() {
        return firstName;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty("lastName")
    public java.util.Optional<String> getLastName() {
        return lastName;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonCard personCard = (PersonCard) o;
        return java.util.Objects.equals(this.firstName, personCard.firstName) && java.util.Objects
            .equals(this.lastName, personCard.lastName) && super.equals(o);
    }

    @Override public int hashCode() {
        return java.util.Objects.hash(firstName, lastName, super.hashCode());
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonCard {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

        public Builder setFirstName(final java.util.Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final java.util.Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonCard build() {
            return new PersonCard(this.firstName, this.lastName);
        }
    }
}
