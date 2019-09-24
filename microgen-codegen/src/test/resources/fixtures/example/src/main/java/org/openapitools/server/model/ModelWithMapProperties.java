package org.openapitools.server.model;

/**
 * This is a model object that has map properties of type&#x3D;integer, type&#x3D;string, and
 * type&#x3D;&lt;model&gt;.
 */
@javax.json.bind.annotation.JsonbPropertyOrder({ModelWithMapProperties.JSON_PROPERTY_STRING_MAP,
                                                   ModelWithMapProperties.JSON_PROPERTY_INTEGER_MAP,
                                                   ModelWithMapProperties.JSON_PROPERTY_ERROR_INFO_MAP,
                                                   ModelWithMapProperties.JSON_PROPERTY_ERROR_INFO_ARRAY_MAP})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public final class ModelWithMapProperties {

    private final java.util.Optional<java.util.Map<String, String>> stringMap;

    public static final String JSON_PROPERTY_STRING_MAP = "stringMap";

    private final java.util.Optional<java.util.Map<String, Integer>> integerMap;

    public static final String JSON_PROPERTY_INTEGER_MAP = "integerMap";

    @javax.validation.Valid private final java.util.Optional<java.util.Map<String, ErrorInfo>>
        errorInfoMap;

    public static final String JSON_PROPERTY_ERROR_INFO_MAP = "errorInfoMap";

    @javax.validation.Valid
    private final java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>>
        errorInfoArrayMap;

    public static final String JSON_PROPERTY_ERROR_INFO_ARRAY_MAP = "errorInfoArrayMap";

    @javax.json.bind.annotation.JsonbCreator public ModelWithMapProperties(
        @javax.json.bind.annotation.JsonbProperty("stringMap")
        final java.util.Optional<java.util.Map<String, String>> stringMap,
        @javax.json.bind.annotation.JsonbProperty("integerMap")
        final java.util.Optional<java.util.Map<String, Integer>> integerMap,
        @javax.json.bind.annotation.JsonbProperty("errorInfoMap")
        final java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap,
        @javax.json.bind.annotation.JsonbProperty("errorInfoArrayMap")
        final java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>> errorInfoArrayMap) {
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
    public java.util.Optional<java.util.Map<String, String>> getStringMap() {
        return stringMap;
    }

    /**
     * Get integerMap
     *
     * @return integerMap
     */
    @javax.json.bind.annotation.JsonbProperty("integerMap")
    public java.util.Optional<java.util.Map<String, Integer>> getIntegerMap() {
        return integerMap;
    }

    /**
     * Get errorInfoMap
     *
     * @return errorInfoMap
     */
    @javax.json.bind.annotation.JsonbProperty("errorInfoMap")
    public java.util.Optional<java.util.Map<String, ErrorInfo>> getErrorInfoMap() {
        return errorInfoMap;
    }

    /**
     * Get errorInfoArrayMap
     *
     * @return errorInfoArrayMap
     */
    @javax.json.bind.annotation.JsonbProperty("errorInfoArrayMap")
    public java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>> getErrorInfoArrayMap() {
        return errorInfoArrayMap;
    }

    @Override public boolean equals(java.lang.Object o) {
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
            && java.util.Objects
            .equals(this.errorInfoArrayMap, modelWithMapProperties.errorInfoArrayMap);
    }

    @Override public int hashCode() {
        return java.util.Objects.hash(stringMap, integerMap, errorInfoMap, errorInfoArrayMap);
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelWithMapProperties {\n");

        sb.append("    stringMap: ").append(toIndentedString(stringMap)).append("\n");
        sb.append("    integerMap: ").append(toIndentedString(integerMap)).append("\n");
        sb.append("    errorInfoMap: ").append(toIndentedString(errorInfoMap)).append("\n");
        sb.append("    errorInfoArrayMap: ").append(toIndentedString(errorInfoArrayMap))
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

    public static Builder builder() {
        return Builder.create();
    }

    public static final class Builder {
        private java.util.Optional<java.util.Map<String, String>> stringMap;
        private java.util.Optional<java.util.Map<String, Integer>> integerMap;
        private java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap;
        private java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>>
            errorInfoArrayMap;

        private Builder() {}

        public static Builder create() {
            return new Builder();
        }

        public Builder setStringMap(
            final java.util.Optional<java.util.Map<String, String>> stringMap) {
            this.stringMap = stringMap;
            return this;
        }

        public Builder setIntegerMap(
            final java.util.Optional<java.util.Map<String, Integer>> integerMap) {
            this.integerMap = integerMap;
            return this;
        }

        public Builder setErrorInfoMap(
            final java.util.Optional<java.util.Map<String, ErrorInfo>> errorInfoMap) {
            this.errorInfoMap = errorInfoMap;
            return this;
        }

        public Builder setErrorInfoArrayMap(
            final java.util.Optional<java.util.Map<String, java.util.List<ErrorInfo>>> errorInfoArrayMap) {
            this.errorInfoArrayMap = errorInfoArrayMap;
            return this;
        }

        public ModelWithMapProperties build() {
            return new ModelWithMapProperties(this.stringMap, this.integerMap, this.errorInfoMap,
                this.errorInfoArrayMap);
        }
    }
}
