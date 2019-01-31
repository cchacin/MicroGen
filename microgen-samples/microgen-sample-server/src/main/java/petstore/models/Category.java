package petstore.models;


/**
 * Category
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class Category {

    private final Long id;


    private final String name;


    @javax.json.bind.annotation.JsonbCreator
    public Category(
            @javax.json.bind.annotation.JsonbProperty("id") final Long id,
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
    public Long getId() {
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
}
