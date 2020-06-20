package org.openapitools.server.model;

/** User */
@org.immutables.value.Value.Immutable
@javax.json.bind.annotation.JsonbPropertyOrder({
        User.JSONB_PROPERTY_ID,
        User.JSONB_PROPERTY_USERNAME,
        User.JSONB_PROPERTY_FIRST_NAME,
        User.JSONB_PROPERTY_LAST_NAME,
        User.JSONB_PROPERTY_EMAIL,
        User.JSONB_PROPERTY_PASSWORD,
        User.JSONB_PROPERTY_PHONE,
        User.JSONB_PROPERTY_USER_STATUS
})
@javax.json.bind.annotation.JsonbTypeSerializer(UserSerializer.class)
@javax.json.bind.annotation.JsonbTypeDeserializer(UserSerializer.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class User implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_USERNAME = "username";
    public static final String JSONB_PROPERTY_FIRST_NAME = "firstName";
    public static final String JSONB_PROPERTY_LAST_NAME = "lastName";
    public static final String JSONB_PROPERTY_EMAIL = "email";
    public static final String JSONB_PROPERTY_PASSWORD = "password";
    public static final String JSONB_PROPERTY_PHONE = "phone";
    public static final String JSONB_PROPERTY_USER_STATUS = "userStatus";

    @javax.json.bind.annotation.JsonbCreator
    public User() {}

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public abstract java.util.Optional<Long> getId();

    /**
     * Get username
     *
     * @return username
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_USERNAME)
    public abstract java.util.Optional<String> getUsername();

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

    /**
     * Get email
     *
     * @return email
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_EMAIL)
    public abstract java.util.Optional<String> getEmail();

    /**
     * Get password
     *
     * @return password
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PASSWORD)
    public abstract java.util.Optional<String> getPassword();

    /**
     * Get phone
     *
     * @return phone
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PHONE)
    public abstract java.util.Optional<String> getPhone();

    /**
     * User Status
     *
     * @return userStatus
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_USER_STATUS)
    public abstract java.util.Optional<Integer> getUserStatus();

    public static class Builder extends ImmutableUser.Builder {}

    public static Builder builder() {
        return new Builder();
    }
}
