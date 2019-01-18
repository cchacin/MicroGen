package petstore.models;


/**
 * Tag
 */

@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true
)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class Tag {

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


    public static class Builder extends TagInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}

