package org.openapitools.server.model;

/** User */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbAnnotation.class,
                javax.json.bind.annotation.JsonbCreator.class,
                javax.json.bind.annotation.JsonbDateFormat.class,
                javax.json.bind.annotation.JsonbNillable.class,
                javax.json.bind.annotation.JsonbNumberFormat.class,
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbPropertyOrder.class,
                javax.json.bind.annotation.JsonbTransient.class,
                javax.json.bind.annotation.JsonbTypeAdapter.class,
                javax.json.bind.annotation.JsonbTypeSerializer.class,
                javax.json.bind.annotation.JsonbTypeDeserializer.class,
                javax.json.bind.annotation.JsonbVisibility.class
        },
        jdkOnly = true)
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
@javax.json.bind.annotation.JsonbTypeAdapter(User.UserJsonbTypeAdapter.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class User {

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
    public abstract java.util.OptionalLong getId();

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
    public abstract java.util.OptionalInt getUserStatus();

    @javax.ws.rs.ext.Provider
    public static class UserJsonbTypeAdapter
            implements javax.json.bind.adapter.JsonbAdapter<User, UserInternalBuilder.ImmutableUser> {

        @Override
        public UserInternalBuilder.ImmutableUser adaptToJson(User obj) throws Exception {
            return UserInternalBuilder.ImmutableUser.copyOf(obj);
        }

        @Override
        public User adaptFromJson(UserInternalBuilder.ImmutableUser obj) throws Exception {
            return obj;
        }
    }

    public static class Builder extends UserInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
