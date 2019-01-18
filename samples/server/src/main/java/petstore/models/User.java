package petstore.models;


/**
 * User
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
public abstract class User {

    /**
     * Get id
     *
     * @return id
     */
    
    @javax.json.bind.annotation.JsonbProperty("id")
    public abstract java.util.Optional<Long> getId();

    /**
     * Get username
     *
     * @return username
     */
    
    @javax.json.bind.annotation.JsonbProperty("username")
    public abstract java.util.Optional<String> getUsername();

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

    /**
     * Get email
     *
     * @return email
     */
    
    @javax.json.bind.annotation.JsonbProperty("email")
    public abstract java.util.Optional<String> getEmail();

    /**
     * Get password
     *
     * @return password
     */
    
    @javax.json.bind.annotation.JsonbProperty("password")
    public abstract java.util.Optional<String> getPassword();

    /**
     * Get phone
     *
     * @return phone
     */
    
    @javax.json.bind.annotation.JsonbProperty("phone")
    public abstract java.util.Optional<String> getPhone();

    /**
     * User Status
     *
     * @return userStatus
     */
    
    @javax.json.bind.annotation.JsonbProperty("userStatus")
    public abstract java.util.Optional<Integer> getUserStatus();


    public static class Builder extends UserInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}

