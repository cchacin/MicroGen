package io.swagger.server.model;

/**
 * This is a model object that has additionalProperties with type&#x3D;string.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class ModelWithStringAdditionalProperties extends java.util.HashMap<String, String> {

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithStringAdditionalProperties() {
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithStringAdditionalProperties {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
