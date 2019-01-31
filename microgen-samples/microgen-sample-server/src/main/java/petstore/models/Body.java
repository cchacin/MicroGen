package petstore.models;


/**
 * Body
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class Body {

    private final String name;


    private final String status;


    @javax.json.bind.annotation.JsonbCreator
    public Body(
            @javax.json.bind.annotation.JsonbProperty("name") final String name,
            @javax.json.bind.annotation.JsonbProperty("status") final String status
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
    public String getName() {
        return name;
    }


    /**
     * Updated status of the pet
     *
     * @return status
     */
    @javax.json.bind.annotation.JsonbProperty("status")
    public String getStatus() {
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
        Body body = (Body) o;
        return java.util.Objects.equals(this.name, body.name) &&
                java.util.Objects.equals(this.status, body.status);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Body {\n");

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
}
