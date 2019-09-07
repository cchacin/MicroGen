package io.swagger.server.model;

/** This is an subclass defived from the SampleBase class. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class SampleSubClass {

    private final String baseClassStringProp;

    private final java.util.OptionalInt baseClassIntegerProp;

    private final String subClassStringProp;

    private final java.util.OptionalInt subClassIntegerProp;

    @javax.json.bind.annotation.JsonbCreator
    public SampleSubClass(
            @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
            final String baseClassStringProp,
            @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
            final java.util.OptionalInt baseClassIntegerProp,
            @javax.json.bind.annotation.JsonbProperty("subClassStringProp")
            final String subClassStringProp,
            @javax.json.bind.annotation.JsonbProperty("subClassIntegerProp")
            final java.util.OptionalInt subClassIntegerProp) {
        this.baseClassStringProp = baseClassStringProp;
        this.baseClassIntegerProp = baseClassIntegerProp;
        this.subClassStringProp = subClassStringProp;
        this.subClassIntegerProp = subClassIntegerProp;
    }

    /**
     * Get baseClassStringProp
     *
     * @return baseClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
    public String getBaseClassStringProp() {
        return baseClassStringProp;
    }

    /**
     * Get baseClassIntegerProp
     *
     * @return baseClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
    public java.util.OptionalInt getBaseClassIntegerProp() {
        return baseClassIntegerProp;
    }

    /**
     * Get subClassStringProp
     *
     * @return subClassStringProp
     */
    @javax.json.bind.annotation.JsonbProperty("subClassStringProp")
    public String getSubClassStringProp() {
        return subClassStringProp;
    }

    /**
     * Get subClassIntegerProp
     *
     * @return subClassIntegerProp
     */
    @javax.json.bind.annotation.JsonbProperty("subClassIntegerProp")
    public java.util.OptionalInt getSubClassIntegerProp() {
        return subClassIntegerProp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleSubClass sampleSubClass = (SampleSubClass) o;
        return java.util.Objects.equals(this.baseClassStringProp, sampleSubClass.baseClassStringProp)
                && java.util.Objects.equals(this.baseClassIntegerProp, sampleSubClass.baseClassIntegerProp)
                && java.util.Objects.equals(this.subClassStringProp, sampleSubClass.subClassStringProp)
                && java.util.Objects.equals(this.subClassIntegerProp, sampleSubClass.subClassIntegerProp);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
                baseClassStringProp, baseClassIntegerProp, subClassStringProp, subClassIntegerProp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleSubClass {\n");

        sb.append("    baseClassStringProp: ")
          .append(toIndentedString(baseClassStringProp))
          .append("\n");
        sb.append("    baseClassIntegerProp: ")
          .append(toIndentedString(baseClassIntegerProp))
          .append("\n");
        sb.append("    subClassStringProp: ").append(toIndentedString(subClassStringProp)).append("\n");
        sb.append("    subClassIntegerProp: ")
          .append(toIndentedString(subClassIntegerProp))
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
}
