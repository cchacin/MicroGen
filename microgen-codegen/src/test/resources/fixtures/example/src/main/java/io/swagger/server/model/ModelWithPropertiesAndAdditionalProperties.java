package io.swagger.server.model;

/**
 * This is a model object that has properties and additionalProperties.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class ModelWithPropertiesAndAdditionalProperties
        extends java.util.HashMap<String, String> {

    private final java.util.OptionalInt integerProp;

    private final String stringProp;

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithPropertiesAndAdditionalProperties(
            @javax.json.bind.annotation.JsonbProperty("integerProp") final java.util.OptionalInt integerProp,
            @javax.json.bind.annotation.JsonbProperty("stringProp") final String stringProp) {
        this.integerProp = integerProp;
        this.stringProp = stringProp;
    }

    /**
     * Get integerProp
     *
     * @return integerProp
     */
    @javax.json.bind.annotation.JsonbProperty("integerProp")
    public java.util.OptionalInt getIntegerProp() {
        return integerProp;
    }

    /**
     * Get stringProp
     *
     * @return stringProp
     */
    @javax.json.bind.annotation.JsonbProperty("stringProp")
    public String getStringProp() {
        return stringProp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithPropertiesAndAdditionalProperties modelWithPropertiesAndAdditionalProperties =
                (ModelWithPropertiesAndAdditionalProperties) o;
        return java.util.Objects.equals(
                this.integerProp, modelWithPropertiesAndAdditionalProperties.integerProp)
                && java.util.Objects.equals(
                this.stringProp, modelWithPropertiesAndAdditionalProperties.stringProp)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(integerProp, stringProp, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithPropertiesAndAdditionalProperties {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    integerProp: ").append(toIndentedString(integerProp)).append("\n");
        sb.append("    stringProp: ").append(toIndentedString(stringProp)).append("\n");
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
