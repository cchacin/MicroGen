package petstore.models;


/**
 * InlineObject
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class InlineObject {
    
    private final java.util.Optional<String> name;
    
    
    private final java.util.Optional<String> status;
    

    @javax.json.bind.annotation.JsonbCreator
    public InlineObject(
        @javax.json.bind.annotation.JsonbProperty("name")
        final java.util.Optional<String> name,
        @javax.json.bind.annotation.JsonbProperty("status")
        final java.util.Optional<String> status
    ) {
        this.name = name;
        this.status = status;
    }
    
    /**
 * Updated name of the pet
 *
 * @return name
 */
    @javax.json.bind.annotation.JsonbProperty("name")
    public java.util.Optional<String> getName() {
        return name;
    }

    
    /**
 * Updated status of the pet
 *
 * @return status
 */
    @javax.json.bind.annotation.JsonbProperty("status")
    public java.util.Optional<String> getStatus() {
        return status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineObject inlineObject = (InlineObject) o;
        return java.util.Objects.equals(this.name, inlineObject.name) &&
    java.util.Objects.equals(this.status, inlineObject.status);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineObject {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    private java.util.Optional<String> name;
    private java.util.Optional<String> status;

    private Builder() {
    }

    public static Builder create() {
        return new Builder();
    }
    public Builder setName(final java.util.Optional<String> name) {
        this.name = name;
        return this;
    }
    public Builder setStatus(final java.util.Optional<String> status) {
        this.status = status;
        return this;
    }
    
    public InlineObject build() {
        return new InlineObject(
            this.name,    
            this.status    
        );        
    }
}
}
