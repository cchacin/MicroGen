package petstore.models;


/**
 * Tag
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class Tag {
    
    private final java.util.OptionalLong id;
    
    
    private final String name;
    

    @javax.json.bind.annotation.JsonbCreator
    public Tag(
        @javax.json.bind.annotation.JsonbProperty("id") final java.util.OptionalLong id,
        @javax.json.bind.annotation.JsonbProperty("name") final String name
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
    public String getName() {
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
        Tag tag = (Tag) o;
        return java.util.Objects.equals(this.id, tag.id) &&
    java.util.Objects.equals(this.name, tag.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        
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
}
