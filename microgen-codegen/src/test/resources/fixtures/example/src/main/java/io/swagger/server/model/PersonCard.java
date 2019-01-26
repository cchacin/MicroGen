package io.swagger.server.model;

/** This is an card object for a Person derived from BaseCard. */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbCreator.class
        },
        jdkOnly = true)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class PersonCard extends BaseCard {

    @javax.json.bind.annotation.JsonbCreator
    public PersonCard() {}

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty("firstName")
    public abstract java.util.Optional<String> getFirstName();

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty("lastName")
    public abstract java.util.Optional<String> getLastName();
}
