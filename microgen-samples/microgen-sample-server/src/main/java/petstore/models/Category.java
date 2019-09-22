package petstore.models;


/**
 * Category
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class Category {
    
    private final java.util.OptionalLong id;
    
    
    private final java.util.Optional<String> name;
    

    @javax.json.bind.annotation.JsonbCreator
    public Category(
        @javax.json.bind.annotation.JsonbProperty("id")
        final java.util.OptionalLong id,
        @javax.json.bind.annotation.JsonbProperty("name")
        final java.util.Optional<String> name
    ) {
        this.id = id;
        this.name = name;
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
 * Get name
 *
 * @return name
 */
    @javax.json.bind.annotation.JsonbProperty("name")
    public java.util.Optional<String> getName() {
        return name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return java.util.Objects.equals(this.id, category.id) &&
    java.util.Objects.equals(this.name, category.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Category {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    private java.util.Optional<String> name;

    private Builder() {
    }

    public static Builder create() {
        return new Builder();
    }
    public Builder setId(final java.util.OptionalLong id) {
        this.id = id;
        return this;
    }
    public Builder setName(final java.util.Optional<String> name) {
        this.name = name;
        return this;
    }
    
    public Category build() {
        return new Category(
            this.id,    
            this.name    
        );        
    }
}
}
