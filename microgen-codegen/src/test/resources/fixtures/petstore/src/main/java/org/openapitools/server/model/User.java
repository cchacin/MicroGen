package org.openapitools.server.model;

/** User */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@io.quarkus.runtime.annotations.RegisterForReflection
public class User implements OpenAPIModel {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_USERNAME = "username";
    public static final String JSONB_PROPERTY_FIRST_NAME = "firstName";
    public static final String JSONB_PROPERTY_LAST_NAME = "lastName";
    public static final String JSONB_PROPERTY_EMAIL = "email";
    public static final String JSONB_PROPERTY_PASSWORD = "password";
    public static final String JSONB_PROPERTY_PHONE = "phone";
    public static final String JSONB_PROPERTY_USER_STATUS = "userStatus";

    private java.util.Optional<Long> id = java.util.Optional.empty();

    private java.util.Optional<String> username = java.util.Optional.empty();

    private java.util.Optional<String> firstName = java.util.Optional.empty();

    private java.util.Optional<String> lastName = java.util.Optional.empty();

    private java.util.Optional<String> email = java.util.Optional.empty();

    private java.util.Optional<String> password = java.util.Optional.empty();

    private java.util.Optional<String> phone = java.util.Optional.empty();

    private java.util.Optional<Integer> userStatus = java.util.Optional.empty();

    public User() {}

    public User(
            final java.util.Optional<Long> id,
            final java.util.Optional<String> username,
            final java.util.Optional<String> firstName,
            final java.util.Optional<String> lastName,
            final java.util.Optional<String> email,
            final java.util.Optional<String> password,
            final java.util.Optional<String> phone,
            final java.util.Optional<Integer> userStatus) {
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
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public java.util.Optional<Long> getId() {
        return id;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public void setId(java.util.Optional<Long> id) {
        this.id = id;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_USERNAME)
    public java.util.Optional<String> getUsername() {
        return username;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_USERNAME)
    public void setUsername(java.util.Optional<String> username) {
        this.username = username;
    }

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_FIRST_NAME)
    public java.util.Optional<String> getFirstName() {
        return firstName;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_FIRST_NAME)
    public void setFirstName(java.util.Optional<String> firstName) {
        this.firstName = firstName;
    }

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_LAST_NAME)
    public java.util.Optional<String> getLastName() {
        return lastName;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_LAST_NAME)
    public void setLastName(java.util.Optional<String> lastName) {
        this.lastName = lastName;
    }

    /**
     * Get email
     *
     * @return email
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_EMAIL)
    public java.util.Optional<String> getEmail() {
        return email;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_EMAIL)
    public void setEmail(java.util.Optional<String> email) {
        this.email = email;
    }

    /**
     * Get password
     *
     * @return password
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PASSWORD)
    public java.util.Optional<String> getPassword() {
        return password;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PASSWORD)
    public void setPassword(java.util.Optional<String> password) {
        this.password = password;
    }

    /**
     * Get phone
     *
     * @return phone
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PHONE)
    public java.util.Optional<String> getPhone() {
        return phone;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_PHONE)
    public void setPhone(java.util.Optional<String> phone) {
        this.phone = phone;
    }

    /**
     * User Status
     *
     * @return userStatus
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_USER_STATUS)
    public java.util.Optional<Integer> getUserStatus() {
        return userStatus;
    }

    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_USER_STATUS)
    public void setUserStatus(java.util.Optional<Integer> userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return java.util.Objects.equals(this.id, user.id)
                && java.util.Objects.equals(this.username, user.username)
                && java.util.Objects.equals(this.firstName, user.firstName)
                && java.util.Objects.equals(this.lastName, user.lastName)
                && java.util.Objects.equals(this.email, user.email)
                && java.util.Objects.equals(this.password, user.password)
                && java.util.Objects.equals(this.phone, user.phone)
                && java.util.Objects.equals(this.userStatus, user.userStatus);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
                id, username, firstName, lastName, email, password, phone, userStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    " + JSONB_PROPERTY_ID + ": ").append(toIndentedString(id)).append("\n");
        sb.append("    " + JSONB_PROPERTY_USERNAME + ": ")
                .append(toIndentedString(username))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_FIRST_NAME + ": ")
                .append(toIndentedString(firstName))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_LAST_NAME + ": ")
                .append(toIndentedString(lastName))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_EMAIL + ": ").append(toIndentedString(email)).append("\n");
        sb.append("    " + JSONB_PROPERTY_PASSWORD + ": ")
                .append(toIndentedString(password))
                .append("\n");
        sb.append("    " + JSONB_PROPERTY_PHONE + ": ").append(toIndentedString(phone)).append("\n");
        sb.append("    " + JSONB_PROPERTY_USER_STATUS + ": ")
                .append(toIndentedString(userStatus))
                .append("\n");
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
        private java.util.Optional<Long> id;
        private java.util.Optional<String> username;
        private java.util.Optional<String> firstName;
        private java.util.Optional<String> lastName;
        private java.util.Optional<String> email;
        private java.util.Optional<String> password;
        private java.util.Optional<String> phone;
        private java.util.Optional<Integer> userStatus;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder id(final java.util.Optional<Long> id) {
            this.id = id;
            return this;
        }

        public Builder id(final Long id) {
            this.id = java.util.Optional.ofNullable(id);
            return this;
        }

        public Builder username(final java.util.Optional<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(final String username) {
            this.username = java.util.Optional.ofNullable(username);
            return this;
        }

        public Builder firstName(final java.util.Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(final String firstName) {
            this.firstName = java.util.Optional.ofNullable(firstName);
            return this;
        }

        public Builder lastName(final java.util.Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(final String lastName) {
            this.lastName = java.util.Optional.ofNullable(lastName);
            return this;
        }

        public Builder email(final java.util.Optional<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(final String email) {
            this.email = java.util.Optional.ofNullable(email);
            return this;
        }

        public Builder password(final java.util.Optional<String> password) {
            this.password = password;
            return this;
        }

        public Builder password(final String password) {
            this.password = java.util.Optional.ofNullable(password);
            return this;
        }

        public Builder phone(final java.util.Optional<String> phone) {
            this.phone = phone;
            return this;
        }

        public Builder phone(final String phone) {
            this.phone = java.util.Optional.ofNullable(phone);
            return this;
        }

        public Builder userStatus(final java.util.Optional<Integer> userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public Builder userStatus(final Integer userStatus) {
            this.userStatus = java.util.Optional.ofNullable(userStatus);
            return this;
        }

        public User build() {
            return new User(
                    this.id,
                    this.username,
                    this.firstName,
                    this.lastName,
                    this.email,
                    this.password,
                    this.phone,
                    this.userStatus);
        }
    }
}
