package io.swagger.server.api;

import io.swagger.server.model.AllModels;
import io.swagger.server.model.ErrorInfo;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public interface ParametersGroupApi {

    /**
     * Summary: This is an endpoint which tests array input parameters. Description: This is an
     * endpoint which tests array input parameters.
     *
     * @param queryParamStringArrayOptional This is a description of queryParamStringArrayOptional, an
     *     optional string array query parameter (optional)
     * @param queryParamStringArrayRequired This is a description of queryParamStringArrayRequired, a
     *     required string array query parameter (required)
     * @param queryParamIntArrayOptional This is a description of queryParamIntArrayOptional, an
     *     optional Int array query parameter (optional)
     * @param queryParamIntArrayRequired This is a description of queryParamIntArrayRequired, a
     *     required Int array query parameter (required)
     * @param queryParamInt64ArrayOptional This is a description of queryParamInt64ArrayOptional, an
     *     optional Int64 array query parameter (optional)
     * @param queryParamInt64ArrayRequired This is a description of queryParamInt64ArrayRequired, a
     *     required Int64 array query parameter (required)
     * @param queryParamFloatArrayOptional This is a description of queryParamFloatArrayOptional, an
     *     optional float array query parameter (optional)
     * @param queryParamFloatArrayRequired This is a description of queryParamFloatArrayRequired, a
     *     required float array query parameter (required)
     * @param queryParamDoubleArrayOptional This is a description of queryParamDoubleArrayOptional, an
     *     optional double array query parameter (optional)
     * @param queryParamDoubleArrayRequired This is a description of queryParamDoubleArrayRequired, a
     *     required double array query parameter (required)
     * @param queryParamBooleanArrayOptional This is a description of queryParamBooleanArrayOptional,
     *     an optional boolean array query parameter (optional)
     * @param queryParamBooleanArrayRequired This is a description of queryParamBooleanArrayRequired,
     *     a required boolean array query parameter (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/arrays")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getParametersArrays(
        @javax.ws.rs.BeanParam GetParametersArraysParam params)
        throws javax.ws.rs.WebApplicationException;

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class GetParametersArraysParam {

        @javax.ws.rs.QueryParam("queryParamStringArrayOptional")
        public abstract java.util.List<String> queryParamStringArrayOptional();

        @javax.ws.rs.QueryParam("queryParamStringArrayRequired")
        public abstract java.util.List<String> queryParamStringArrayRequired();

        @javax.ws.rs.QueryParam("queryParamIntArrayOptional")
        public abstract java.util.List<Integer> queryParamIntArrayOptional();

        @javax.ws.rs.QueryParam("queryParamIntArrayRequired")
        public abstract java.util.List<Integer> queryParamIntArrayRequired();

        @javax.ws.rs.QueryParam("queryParamInt64ArrayOptional")
        public abstract java.util.List<Long> queryParamInt64ArrayOptional();

        @javax.ws.rs.QueryParam("queryParamInt64ArrayRequired")
        public abstract java.util.List<Long> queryParamInt64ArrayRequired();

        @javax.ws.rs.QueryParam("queryParamFloatArrayOptional")
        public abstract java.util.List<Float> queryParamFloatArrayOptional();

        @javax.ws.rs.QueryParam("queryParamFloatArrayRequired")
        public abstract java.util.List<Float> queryParamFloatArrayRequired();

        @javax.ws.rs.QueryParam("queryParamDoubleArrayOptional")
        public abstract java.util.List<Double> queryParamDoubleArrayOptional();

        @javax.ws.rs.QueryParam("queryParamDoubleArrayRequired")
        public abstract java.util.List<Double> queryParamDoubleArrayRequired();

        @javax.ws.rs.QueryParam("queryParamBooleanArrayOptional")
        public abstract java.util.List<Boolean> queryParamBooleanArrayOptional();

        @javax.ws.rs.QueryParam("queryParamBooleanArrayRequired")
        public abstract java.util.List<Boolean> queryParamBooleanArrayRequired();

        public static class Builder extends GetParametersArraysParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }

    /**
     * Summary: This is an endpoint which tests collectionFormat. Description: This is an endpoint
     * which tests all of the values of collectionFormat on input array parameters.
     *
     * @param stringArrayCSV This is a description of stringArrayCSV, an optional array of strings
     *     query parameter which uses a comma delimiter. (optional)
     * @param stringArraySSV This is a description of stringArraySSV, an optional array of strings
     *     query parameter which uses a space delimiter. (optional)
     * @param stringArrayTSV This is a description of stringArrayTSV, an optional array of strings
     *     query parameter which uses a tab delimiter. (optional)
     * @param stringArrayPipes This is a description of stringArrayPipes, an optional array of strings
     *     query parameter which uses a | delimiter. (optional)
     * @param stringArrayMulti This is a description of stringArrayMulti, an optional array of strings
     *     query parameter which uses a separate query parameter for each element of the array.
     *     (optional)
     * @param stringArrayPipesOfStringArrayCSV This is an optional parameter which is a string array
     *     of string arrays. The outer delimiter is the pipe (&#39;|&#39;) and the inner delimiter is
     *     the comma (&#39;,&#39;). An example would be: &#39;a,b,c|d,e|f,g,h&#39;. (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/arrays/collectionFormat")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>
    getParametersArraysCollectionFormat(
        @javax.ws.rs.BeanParam GetParametersArraysCollectionFormatParam params)
        throws javax.ws.rs.WebApplicationException;

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class GetParametersArraysCollectionFormatParam {

        @javax.ws.rs.QueryParam("stringArrayCSV")
        public abstract java.util.List<String> stringArrayCSV();

        @javax.ws.rs.QueryParam("stringArraySSV")
        public abstract java.util.List<String> stringArraySSV();

        @javax.ws.rs.QueryParam("stringArrayTSV")
        public abstract java.util.List<String> stringArrayTSV();

        @javax.ws.rs.QueryParam("stringArrayPipes")
        public abstract java.util.List<String> stringArrayPipes();

        @javax.ws.rs.QueryParam("stringArrayMulti")
        public abstract java.util.List<String> stringArrayMulti();

        @javax.ws.rs.QueryParam("stringArrayPipesOfStringArrayCSV")
        public abstract java.util.List<java.util.List<String>> stringArrayPipesOfStringArrayCSV();

        public static class Builder extends GetParametersArraysCollectionFormatParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }

    /**
     * Summary: This is an endpoint which tests parameters. Description: This is an endpoint which
     * tests input parameters.
     *
     * @param pathParam This is a description of pathParam, a path parameter. (required)
     * @param enumPathParam This is a description of enumPathParams, an Enum path parameter.
     *     (required)
     * @param queryParamStringOptional This is an optional string parameter. It provides a default
     *     value. (optional)
     * @param queryParamStringRequired This is a required string parameter. (required)
     * @param queryParamNumberRequired This is a description of queryParamDoubleRequired, a required
     *     double query parameter (required)
     * @param queryParamUUIDRequired This is a required UUID parameter. (required)
     * @param queryParamFloatOptional This is a description of queryParamFloatOptional, an optional
     *     float query parameter (optional)
     * @param queryParamFloatRequired This is a description of queryParamFloatRequired, a required
     *     float query parameter (required)
     * @param queryParamDoubleOptional This is a description of queryParamDoubleOptional, an optional
     *     double query parameter (optional)
     * @param queryParamDoubleRequired This is a description of queryParamDoubleRequired, a required
     *     double query parameter (required)
     * @param queryParamIntOptional This is a description of queryParamIntOptional, an optional
     *     integer query parameter (optional)
     * @param queryParamIntRequired This is a description of queryParamIntRequired, a required integer
     *     query parameter (required)
     * @param queryParamInt64Optional This is a description of queryParamInt64Optional, an optional
     *     integer query parameter (optional)
     * @param queryParamInt64Required This is a description of queryParamInt64Required, a required
     *     integer query parameter (required)
     * @param queryParamBooleanOptional This is a description of queryParamBooleanOptional, an
     *     optional boolean query parameter (optional)
     * @param queryParamBooleanRequired This is a description of queryParamBooleanRequired, a required
     *     boolean query parameter (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/{pathParam}/all/{enumPathParam}")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getParametersScalars(
        @javax.ws.rs.BeanParam GetParametersScalarsParam params)
        throws javax.ws.rs.WebApplicationException;

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class GetParametersScalarsParam {
        @javax.ws.rs.PathParam("pathParam")
        public abstract String pathParam();

        @javax.ws.rs.PathParam("enumPathParam")
        public abstract String enumPathParam();

        @javax.ws.rs.QueryParam("queryParamStringOptional")
        public abstract String queryParamStringOptional();

        @javax.ws.rs.QueryParam("queryParamStringRequired")
        public abstract String queryParamStringRequired();

        @javax.ws.rs.QueryParam("queryParamNumberRequired")
        public abstract java.math.BigDecimal queryParamNumberRequired();

        @javax.ws.rs.QueryParam("queryParamUUIDRequired")
        public abstract java.util.UUID queryParamUUIDRequired();

        @javax.ws.rs.QueryParam("queryParamFloatOptional")
        public abstract Float queryParamFloatOptional();

        @javax.ws.rs.QueryParam("queryParamFloatRequired")
        public abstract Float queryParamFloatRequired();

        @javax.ws.rs.QueryParam("queryParamDoubleOptional")
        public abstract Double queryParamDoubleOptional();

        @javax.ws.rs.QueryParam("queryParamDoubleRequired")
        public abstract Double queryParamDoubleRequired();

        @javax.ws.rs.QueryParam("queryParamIntOptional")
        public abstract Integer queryParamIntOptional();

        @javax.ws.rs.QueryParam("queryParamIntRequired")
        public abstract Integer queryParamIntRequired();

        @javax.ws.rs.QueryParam("queryParamInt64Optional")
        public abstract Long queryParamInt64Optional();

        @javax.ws.rs.QueryParam("queryParamInt64Required")
        public abstract Long queryParamInt64Required();

        @javax.ws.rs.QueryParam("queryParamBooleanOptional")
        public abstract Boolean queryParamBooleanOptional();

        @javax.ws.rs.QueryParam("queryParamBooleanRequired")
        public abstract Boolean queryParamBooleanRequired();

        public static class Builder extends GetParametersScalarsParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }

    /**
     * Summary: This is an endpoint which tests validation conditions on parameters. Description: This
     * is an endpoint which tests various validation conditions for Parameter objects.
     *
     * @param integerParameterWithInclusiveMaximum This is an integer parameter with a maximum
     *     validation constraint of 10. Since exclusiveMaximum is not present (and therefore by
     *     default is false), then the maximum is inclusive. Therefore, the parameter must be
     *     &lt;&#x3D; 10. (optional)
     * @param integerParameterWithExclusiveMaximum This is an integer parameter with a maximum
     *     validation constraint of 10. Since exclusiveMaximum is true, then the parameter must be
     *     &lt; 10 (as opposed to &lt;&#x3D; 10). (optional)
     * @param integerParameterWithInclusiveMinimum This is an integer parameter with a minimum
     *     validation constraint of 10. Since exclusiveMinimum is not present (and therefore by
     *     default is false), then the minimum is inclusive. Therefore, the parameter must be
     *     &gt;&#x3D; 10. (optional)
     * @param integerParameterWithExclusiveMinimum This is an integer parameter with a minimum
     *     validation constraint of 10. Since exclusiveMaximum is true, then the parameter must be
     *     &gt; 10 (as opposed to &gt;&#x3D; 10). (optional)
     * @param stringParameterWithMaxLength This is an string parameter with a maxLength validation
     *     constraint of 10, so the length of the string must be &lt;&#x3D; 10 characters. (optional)
     * @param stringParameterWithMinLength This is an string parameter with a minLength validation
     *     constraint of 10, so the length of the string must be &gt;&#x3D; 10 characters. (optional)
     * @param stringParameterWithPhoneNumberPattern This is a string parameter with a phone number
     *     pattern of &#39;^(\\([0-9]{3}\\))?[0-9]{3}-[0-9]{4}$&#39; so &#39;555-1212&#39; and
     *     &#39;(888)555-1212&#39; would match but &#39;(888)555-1212 ext. 532&#39; and
     *     &#39;(800)FLOWERS&#39; would NOT match. (optional)
     * @param stringArrayParameterWithMaxItems This is a string array parameter with a maxItems of 3
     *     and collectionFormat&#x3D;csv, so the number of elements in the comma-delimited string must
     *     be &lt;&#x3D; 3. So therefore &#39;a,b&#39; and &#39;a,b,c&#39; would pass validation but
     *     &#39;a,b,c,d&#39; would not. (optional)
     * @param stringArrayParameterWithMinItems This is a string array parameter with a minItems of 3
     *     and collectionFormat&#x3D;csv, so the number of elements in the comma-delimited string must
     *     be &gt;&#x3D; 3. So therefore &#39;a,b,c&#39; and &#39;a,b,c,d&#39; would pass validation
     *     but &#39;a,b&#39; would not. (optional)
     * @param stringArrayParameterWithUniqueItems This is a string array parameter with a
     *     uniqueItems&#x3D;true and collectionFormat&#x3D;csv. So therefore &#39;a,b,c&#39; and
     *     &#39;a,b,c,d&#39; would pass validation but &#39;a,b,a&#39; would not. (optional)
     * @param integerParameterWithMultipleOf This is an integer parameter with multipleOf&#x3D;10. So
     *     therefore values of 10, 100, and 10000 would pass validation but 25 would not. (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/validation")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getParametersValidation(
        @javax.ws.rs.BeanParam GetParametersValidationParam params)
        throws javax.ws.rs.WebApplicationException;

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class GetParametersValidationParam {

        @javax.ws.rs.QueryParam("integerParameterWithInclusiveMaximum")
        public abstract Integer integerParameterWithInclusiveMaximum();

        @javax.ws.rs.QueryParam("integerParameterWithExclusiveMaximum")
        public abstract Integer integerParameterWithExclusiveMaximum();

        @javax.ws.rs.QueryParam("integerParameterWithInclusiveMinimum")
        public abstract Integer integerParameterWithInclusiveMinimum();

        @javax.ws.rs.QueryParam("integerParameterWithExclusiveMinimum")
        public abstract Integer integerParameterWithExclusiveMinimum();

        @javax.ws.rs.QueryParam("stringParameterWithMaxLength")
        public abstract String stringParameterWithMaxLength();

        @javax.ws.rs.QueryParam("stringParameterWithMinLength")
        public abstract String stringParameterWithMinLength();

        @javax.ws.rs.QueryParam("stringParameterWithPhoneNumberPattern")
        public abstract String stringParameterWithPhoneNumberPattern();

        @javax.ws.rs.QueryParam("stringArrayParameterWithMaxItems")
        public abstract java.util.List<String> stringArrayParameterWithMaxItems();

        @javax.ws.rs.QueryParam("stringArrayParameterWithMinItems")
        public abstract java.util.List<String> stringArrayParameterWithMinItems();

        @javax.ws.rs.QueryParam("stringArrayParameterWithUniqueItems")
        public abstract java.util.List<String> stringArrayParameterWithUniqueItems();

        @javax.ws.rs.QueryParam("integerParameterWithMultipleOf")
        public abstract Integer integerParameterWithMultipleOf();

        public static class Builder extends GetParametersValidationParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }

    /**
     * Summary: This operation is for testing body input parameters. Description: This operation is
     * for testing an input parameter serialized in the body of the request.
     *
     * @param body This parameter will be serialized in the request body. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("test/parameters/body")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> postBodyParameterJSON(
        @javax.validation.constraints.NotNull @javax.validation.Valid ErrorInfo body)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Summary: This endpoint is for testing multipart/form-data input parameters. Desciption: This
     * operation is for testing multipart/form-data input parameters.
     *
     * @param fileParam (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("test/parameters/multiPartFormData")
    @javax.ws.rs.Consumes({"multipart/form-data"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>
    postFormDataParameterMultipartFormData(
        @javax.ws.rs.BeanParam PostFormDataParameterMultipartFormDataParam params)
        throws javax.ws.rs.WebApplicationException;

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class PostFormDataParameterMultipartFormDataParam {

        @javax.ws.rs.FormParam(value = "fileParam")
        public abstract byte[] fileParam();

        public static class Builder
            extends PostFormDataParameterMultipartFormDataParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }

    /**
     * Summary: This endpoint is for testing url-enoded input parameters. Desciption: This operation
     * is for testing url-encoded input parameters.
     *
     * @param stringParam (optional)
     * @param numberParam (optional)
     * @param integerParam (optional)
     * @param booleanParam (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("test/parameters/urlEncoded")
    @javax.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> postFormDataParametersUrlEncoded(
        @javax.ws.rs.BeanParam PostFormDataParametersUrlEncodedParam params)
        throws javax.ws.rs.WebApplicationException;

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class PostFormDataParametersUrlEncodedParam {

        @javax.ws.rs.FormParam(value = "stringParam")
        public abstract String stringParam();

        @javax.ws.rs.FormParam(value = "numberParam")
        public abstract java.math.BigDecimal numberParam();

        @javax.ws.rs.FormParam(value = "integerParam")
        public abstract Integer integerParam();

        @javax.ws.rs.FormParam(value = "booleanParam")
        public abstract Boolean booleanParam();

        public static class Builder extends PostFormDataParametersUrlEncodedParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }
}
