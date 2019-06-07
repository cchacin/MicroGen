package io.swagger.server.model;

/**
 * This is an card object for a Person derived from BaseCard.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class PersonCard extends BaseCard {

    private final String firstName;

    private final String lastName;

    @javax.json.bind.annotation.JsonbCreator
    public PersonCard(
            @javax.json.bind.annotation.JsonbProperty("firstName") final String firstName,
            @javax.json.bind.annotation.JsonbProperty("lastName") final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty("lastName")
    public String getLastName() {
        return lastName;
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
}
