package petstore.models;


/**
 * Tag
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
public abstract class Tag {

    @javax.json.bind.annotation.JsonbCreator
    public Tag() {
    }

    /**
     * Get id
     *
     * @return id
     */

    @javax.json.bind.annotation.JsonbProperty("id")
    public abstract java.util.Optional<Long> getId();

    /**
     * Get name
     *
     * @return name
     */

    @javax.json.bind.annotation.JsonbProperty("name")
    public abstract java.util.Optional<String> getName();

}

