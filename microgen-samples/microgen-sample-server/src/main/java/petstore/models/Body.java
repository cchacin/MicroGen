package petstore.models;


/**
 * Body
 */

@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {javax.json.bind.annotation.JsonbProperty.class, javax.json.bind.annotation.JsonbCreator.class},
        jdkOnly = true
)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class Body {

    @javax.json.bind.annotation.JsonbCreator
    public Body() {
    }

    /**
     * Updated name of the pet
     *
     * @return name
     */

    @javax.json.bind.annotation.JsonbProperty("name")
    public abstract java.util.Optional<String> getName();

    /**
     * Updated status of the pet
     *
     * @return status
     */

    @javax.json.bind.annotation.JsonbProperty("status")
    public abstract java.util.Optional<String> getStatus();

}

