package io.swagger.server.model;

/** This is an base class object from which other classes will derive. */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class SampleBase {

    private final String baseClassStringProp;

    private final Integer baseClassIntegerProp;

    @javax.json.bind.annotation.JsonbCreator
    public SampleBase(
            @javax.json.bind.annotation.JsonbProperty("baseClassStringProp")
            final String baseClassStringProp,
            @javax.json.bind.annotation.JsonbProperty("baseClassIntegerProp")
            final Integer baseClassIntegerProp) {
        this.baseClassStringProp = baseClassStringProp;
        this.baseClassIntegerProp = baseClassIntegerProp;
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
    public Integer getBaseClassIntegerProp() {
        return baseClassIntegerProp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleBase sampleBase = (SampleBase) o;
        return java.util.Objects.equals(this.baseClassStringProp, sampleBase.baseClassStringProp)
                && java.util.Objects.equals(this.baseClassIntegerProp, sampleBase.baseClassIntegerProp);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(baseClassStringProp, baseClassIntegerProp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleBase {\n");

        sb.append("    baseClassStringProp: ")
                .append(toIndentedString(baseClassStringProp))
                .append("\n");
        sb.append("    baseClassIntegerProp: ")
                .append(toIndentedString(baseClassIntegerProp))
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
