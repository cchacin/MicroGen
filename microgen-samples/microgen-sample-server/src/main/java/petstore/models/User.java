package petstore.models;


/**
 * User
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class User {
    
    private final java.util.OptionalLong id;
    
    
    private final String username;
    
    
    private final String firstName;
    
    
    private final String lastName;
    
    
    private final String email;
    
    
    private final String password;
    
    
    private final String phone;
    
    
    private final java.util.OptionalInt userStatus;
    

    @javax.json.bind.annotation.JsonbCreator
    public User(
        @javax.json.bind.annotation.JsonbProperty("id") final java.util.OptionalLong id,
        @javax.json.bind.annotation.JsonbProperty("username") final String username,
        @javax.json.bind.annotation.JsonbProperty("firstName") final String firstName,
        @javax.json.bind.annotation.JsonbProperty("lastName") final String lastName,
        @javax.json.bind.annotation.JsonbProperty("email") final String email,
        @javax.json.bind.annotation.JsonbProperty("password") final String password,
        @javax.json.bind.annotation.JsonbProperty("phone") final String phone,
        @javax.json.bind.annotation.JsonbProperty("userStatus") final java.util.OptionalInt userStatus
    ) {
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
    @javax.json.bind.annotation.JsonbProperty("id")
    public java.util.OptionalLong getId() {
        return id;
    }

    
    /**
 * Get username
 *
 * @return username
 */
    @javax.json.bind.annotation.JsonbProperty("username")
    public String getUsername() {
        return username;
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

    
    /**
 * Get email
 *
 * @return email
 */
    @javax.json.bind.annotation.JsonbProperty("email")
    public String getEmail() {
        return email;
    }

    
    /**
 * Get password
 *
 * @return password
 */
    @javax.json.bind.annotation.JsonbProperty("password")
    public String getPassword() {
        return password;
    }

    
    /**
 * Get phone
 *
 * @return phone
 */
    @javax.json.bind.annotation.JsonbProperty("phone")
    public String getPhone() {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return java.util.Objects.equals(this.id, user.id) &&
    java.util.Objects.equals(this.username, user.username) &&
    java.util.Objects.equals(this.firstName, user.firstName) &&
    java.util.Objects.equals(this.lastName, user.lastName) &&
    java.util.Objects.equals(this.email, user.email) &&
    java.util.Objects.equals(this.password, user.password) &&
    java.util.Objects.equals(this.phone, user.phone) &&
    java.util.Objects.equals(this.userStatus, user.userStatus);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, username, firstName, lastName, email, password, phone, userStatus);
    }

    @Override
    public String toString() {
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

    public static final class Builder {
    private java.util.OptionalLong id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private java.util.OptionalInt userStatus;

    private Builder() {
    }

    public static Builder create() {
        return new Builder();
    }
    public Builder setId(final java.util.OptionalLong id) {
        this.id = id;
        return this;
    }
    public Builder setUsername(final String username) {
        this.username = username;
        return this;
    }
    public Builder setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }
    public Builder setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }
    public Builder setEmail(final String email) {
        this.email = email;
        return this;
    }
    public Builder setPassword(final String password) {
        this.password = password;
        return this;
    }
    public Builder setPhone(final String phone) {
        this.phone = phone;
        return this;
    }
    public Builder setUserStatus(final java.util.OptionalInt userStatus) {
        this.userStatus = userStatus;
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
            this.userStatus    
        );        
    }
}
}
