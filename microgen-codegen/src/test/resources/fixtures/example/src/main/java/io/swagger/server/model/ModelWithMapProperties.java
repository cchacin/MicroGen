package io.swagger.server.model;

/**
 * This is a model object that has map properties of type&#x3D;integer, type&#x3D;string, and type&#x3D;&lt;model&gt;.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public final class ModelWithMapProperties {

    private final java.util.Map<String, String> stringMap;

    private final java.util.Map<String, Integer> integerMap;

    @javax.validation.Valid
    private final java.util.Map<String, ErrorInfo> errorInfoMap;

    @javax.validation.Valid
    private final java.util.Map<String, java.util.List<ErrorInfo>> errorInfoArrayMap;

    @javax.json.bind.annotation.JsonbCreator
    public ModelWithMapProperties(
            @javax.json.bind.annotation.JsonbProperty("stringMap") final java.util.Map<String, String> stringMap,
            @javax.json.bind.annotation.JsonbProperty("integerMap") final java.util.Map<String, Integer> integerMap,
            @javax.json.bind.annotation.JsonbProperty("errorInfoMap") final java.util.Map<String, ErrorInfo> errorInfoMap,
            @javax.json.bind.annotation.JsonbProperty("errorInfoArrayMap") final java.util.Map<String, java.util.List<ErrorInfo>> errorInfoArrayMap) {
        this.stringMap = stringMap;
        this.integerMap = integerMap;
        this.errorInfoMap = errorInfoMap;
        this.errorInfoArrayMap = errorInfoArrayMap;
    }

    /**
     * Get stringMap
     *
     * @return stringMap
     */
    @javax.json.bind.annotation.JsonbProperty("stringMap")
    public java.util.Map<String, String> getStringMap() {
        return stringMap;
    }

    /**
     * Get integerMap
     *
     * @return integerMap
     */
    @javax.json.bind.annotation.JsonbProperty("integerMap")
    public java.util.Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    /**
     * Get errorInfoMap
     *
     * @return errorInfoMap
     */
    @javax.json.bind.annotation.JsonbProperty("errorInfoMap")
    public java.util.Map<String, ErrorInfo> getErrorInfoMap() {
        return errorInfoMap;
    }

    /**
     * Get errorInfoArrayMap
     *
     * @return errorInfoArrayMap
     */
    @javax.json.bind.annotation.JsonbProperty("errorInfoArrayMap")
    public java.util.Map<String, java.util.List<ErrorInfo>> getErrorInfoArrayMap() {
        return errorInfoArrayMap;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelWithMapProperties modelWithMapProperties = (ModelWithMapProperties) o;
        return java.util.Objects.equals(this.stringMap, modelWithMapProperties.stringMap)
                && java.util.Objects.equals(this.integerMap, modelWithMapProperties.integerMap)
                && java.util.Objects.equals(this.errorInfoMap, modelWithMapProperties.errorInfoMap)
                && java.util.Objects.equals(
                this.errorInfoArrayMap, modelWithMapProperties.errorInfoArrayMap);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(stringMap, integerMap, errorInfoMap, errorInfoArrayMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithMapProperties {\n");

        sb.append("    stringMap: ").append(toIndentedString(stringMap)).append("\n");
        sb.append("    integerMap: ").append(toIndentedString(integerMap)).append("\n");
        sb.append("    errorInfoMap: ").append(toIndentedString(errorInfoMap)).append("\n");
        sb.append("    errorInfoArrayMap: ").append(toIndentedString(errorInfoArrayMap)).append("\n");
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
