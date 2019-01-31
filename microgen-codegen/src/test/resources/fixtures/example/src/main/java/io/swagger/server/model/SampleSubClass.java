package io.swagger.server.model;

/** This is an subclass defived from the SampleBase class. */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class SampleSubClass extends SampleBase {

    private final String subClassStringProp;

    private final Integer subClassIntegerProp;

    @javax.json.bind.annotation.JsonbCreator
    public SampleSubClass(
            @javax.json.bind.annotation.JsonbProperty("subClassStringProp")
            final String subClassStringProp,
            @javax.json.bind.annotation.JsonbProperty("subClassIntegerProp")
            final Integer subClassIntegerProp) {
        this.subClassStringProp = subClassStringProp;
        this.subClassIntegerProp = subClassIntegerProp;
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
    public Integer getSubClassIntegerProp() {
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
        return java.util.Objects.equals(this.subClassStringProp, sampleSubClass.subClassStringProp)
                && java.util.Objects.equals(this.subClassIntegerProp, sampleSubClass.subClassIntegerProp)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(subClassStringProp, subClassIntegerProp, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleSubClass {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
