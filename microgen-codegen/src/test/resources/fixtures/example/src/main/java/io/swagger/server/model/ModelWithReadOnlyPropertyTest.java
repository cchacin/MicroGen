package io.swagger.server.model;

/**
 * This is a model object that contains a property with readOnly&#x3D;true.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class ModelWithReadOnlyPropertyTest {

    private final String stringPropWithImplicitReadOnlyFalse;

    private final String stringPropWithExplicitReadOnlyFalse;

    private final String stringPropWithReadOnlyTrue;

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithReadOnlyPropertyTest(
            @javax.json.bind.annotation.JsonbProperty("stringPropWithImplicitReadOnlyFalse") final String stringPropWithImplicitReadOnlyFalse,
            @javax.json.bind.annotation.JsonbProperty("stringPropWithExplicitReadOnlyFalse") final String stringPropWithExplicitReadOnlyFalse,
            @javax.json.bind.annotation.JsonbProperty("stringPropWithReadOnlyTrue") final String stringPropWithReadOnlyTrue) {
        this.stringPropWithImplicitReadOnlyFalse = stringPropWithImplicitReadOnlyFalse;
        this.stringPropWithExplicitReadOnlyFalse = stringPropWithExplicitReadOnlyFalse;
        this.stringPropWithReadOnlyTrue = stringPropWithReadOnlyTrue;
    }

    /**
     * This is a property without a readOnly attribute, meaning that it takes on the default value of readOnly=false. It
     * should be included in both response and request.
     *
     * @return stringPropWithImplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithImplicitReadOnlyFalse")
    public String getStringPropWithImplicitReadOnlyFalse() {
        return stringPropWithImplicitReadOnlyFalse;
    }

    /**
     * This is a property with readOnly=false. It should be included in both response and request.
     *
     * @return stringPropWithExplicitReadOnlyFalse
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithExplicitReadOnlyFalse")
    public String getStringPropWithExplicitReadOnlyFalse() {
        return stringPropWithExplicitReadOnlyFalse;
    }

    /**
     * This is a property with readOnly=true, meaning that it should be included in the response, but not the request.
     *
     * @return stringPropWithReadOnlyTrue
     */
    @javax.json.bind.annotation.JsonbProperty("stringPropWithReadOnlyTrue")
    public String getStringPropWithReadOnlyTrue() {
        return stringPropWithReadOnlyTrue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithReadOnlyPropertyTest modelWithReadOnlyPropertyTest = (ModelWithReadOnlyPropertyTest) o;
        return java.util.Objects.equals(
                this.stringPropWithImplicitReadOnlyFalse,
                modelWithReadOnlyPropertyTest.stringPropWithImplicitReadOnlyFalse)
                && java.util.Objects.equals(
                this.stringPropWithExplicitReadOnlyFalse,
                modelWithReadOnlyPropertyTest.stringPropWithExplicitReadOnlyFalse)
                && java.util.Objects.equals(
                this.stringPropWithReadOnlyTrue,
                modelWithReadOnlyPropertyTest.stringPropWithReadOnlyTrue);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
                stringPropWithImplicitReadOnlyFalse,
                stringPropWithExplicitReadOnlyFalse,
                stringPropWithReadOnlyTrue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithReadOnlyPropertyTest {\n");

        sb.append("    stringPropWithImplicitReadOnlyFalse: ")
                .append(toIndentedString(stringPropWithImplicitReadOnlyFalse))
                .append("\n");
        sb.append("    stringPropWithExplicitReadOnlyFalse: ")
                .append(toIndentedString(stringPropWithExplicitReadOnlyFalse))
                .append("\n");
        sb.append("    stringPropWithReadOnlyTrue: ")
                .append(toIndentedString(stringPropWithReadOnlyTrue))
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
