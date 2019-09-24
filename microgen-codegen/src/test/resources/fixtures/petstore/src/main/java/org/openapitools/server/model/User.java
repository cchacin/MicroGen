package org.openapitools.server.model;

/**
 * User
 */
@javax.json.bind.annotation.JsonbPropertyOrder({User.JSON_PROPERTY_ID, User.JSON_PROPERTY_USERNAME,
                                                   User.JSON_PROPERTY_FIRST_NAME,
                                                   User.JSON_PROPERTY_LAST_NAME,
                                                   User.JSON_PROPERTY_EMAIL,
                                                   User.JSON_PROPERTY_PASSWORD,
                                                   User.JSON_PROPERTY_PHONE,
                                                   User.JSON_PROPERTY_USER_STATUS})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class User {

    private final java.util.OptionalLong id;
    public static final String JSON_PROPERTY_ID = "id";

    private final java.util.Optional<String> username;
    public static final String JSON_PROPERTY_USERNAME = "username";

    private final java.util.Optional<String> firstName;
    public static final String JSON_PROPERTY_FIRST_NAME = "firstName";

    private final java.util.Optional<String> lastName;
    public static final String JSON_PROPERTY_LAST_NAME = "lastName";

    private final java.util.Optional<String> email;
    public static final String JSON_PROPERTY_EMAIL = "email";

    private final java.util.Optional<String> password;
    public static final String JSON_PROPERTY_PASSWORD = "password";

    private final java.util.Optional<String> phone;
    public static final String JSON_PROPERTY_PHONE = "phone";

    private final java.util.OptionalInt userStatus;
    public static final String JSON_PROPERTY_USER_STATUS = "userStatus";

    @javax.json.bind.annotation.JsonbCreator
    public User(@javax.json.bind.annotation.JsonbProperty("id") final java.util.OptionalLong id,
        @javax.json.bind.annotation.JsonbProperty("username")
        final java.util.Optional<String> username,
        @javax.json.bind.annotation.JsonbProperty("firstName")
        final java.util.Optional<String> firstName,
        @javax.json.bind.annotation.JsonbProperty("lastName")
        final java.util.Optional<String> lastName,
        @javax.json.bind.annotation.JsonbProperty("email") final java.util.Optional<String> email,
        @javax.json.bind.annotation.JsonbProperty("password")
        final java.util.Optional<String> password,
        @javax.json.bind.annotation.JsonbProperty("phone") final java.util.Optional<String> phone,
        @javax.json.bind.annotation.JsonbProperty("userStatus")
        final java.util.OptionalInt userStatus) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty("id") public java.util.OptionalLong getId() {
        return id;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.json.bind.annotation.JsonbProperty("username")
    public java.util.Optional<String> getUsername() {
        return username;
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

    /**
     * Get email
     *
     * @return email
     */
    @javax.json.bind.annotation.JsonbProperty("email")
    public java.util.Optional<String> getEmail() {
        return email;
    }

    /**
     * Get password
     *
     * @return password
     */
    @javax.json.bind.annotation.JsonbProperty("password")
    public java.util.Optional<String> getPassword() {
        return password;
    }

    /**
     * Get phone
     *
     * @return phone
     */
    @javax.json.bind.annotation.JsonbProperty("phone")
    public java.util.Optional<String> getPhone() {
        return phone;
    }

    /**
     * User Status
     *
     * @return userStatus
     */
    @javax.json.bind.annotation.JsonbProperty("userStatus")
    public java.util.OptionalInt getUserStatus() {
        return userStatus;
    }

    @Override public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return java.util.Objects.equals(this.id, user.id) && java.util.Objects
            .equals(this.username, user.username) && java.util.Objects
            .equals(this.firstName, user.firstName) && java.util.Objects
            .equals(this.lastName, user.lastName) && java.util.Objects
            .equals(this.email, user.email) && java.util.Objects
            .equals(this.password, user.password) && java.util.Objects
            .equals(this.phone, user.phone) && java.util.Objects
            .equals(this.userStatus, user.userStatus);
    }

    @Override public int hashCode() {
        return java.util.Objects
            .hash(id, username, firstName, lastName, email, password, phone, userStatus);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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
        private java.util.OptionalLong id;
        private java.util.Optional<String> username;
        private java.util.Optional<String> firstName;
        private java.util.Optional<String> lastName;
        private java.util.Optional<String> email;
        private java.util.Optional<String> password;
        private java.util.Optional<String> phone;
        private java.util.OptionalInt userStatus;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder setId(final java.util.OptionalLong id) {
            this.id = id;
            return this;
        }

        public Builder setUsername(final java.util.Optional<String> username) {
            this.username = username;
            return this;
        }

        public Builder setFirstName(final java.util.Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(final java.util.Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(final java.util.Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(final java.util.Optional<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPhone(final java.util.Optional<String> phone) {
            this.phone = phone;
            return this;
        }

        public Builder setUserStatus(final java.util.OptionalInt userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public User build() {
            return new User(this.id, this.username, this.firstName, this.lastName, this.email,
                this.password, this.phone, this.userStatus);
        }
    }
}
