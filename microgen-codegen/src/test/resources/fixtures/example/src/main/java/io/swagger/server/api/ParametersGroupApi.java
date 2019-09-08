package io.swagger.server.api;

import io.swagger.server.model.ErrorInfo;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface ParametersGroupApi {

    /**
     * Summary: This is an endpoint which tests array input parameters. Description: This is an
     * endpoint which tests array input parameters.
     *
     * @param queryParamStringArrayRequired This is a description of queryParamStringArrayRequired, a
     *     required string array query parameter (required)
     * @param queryParamIntArrayRequired This is a description of queryParamIntArrayRequired, a
     *     required Int array query parameter (required)
     * @param queryParamInt64ArrayRequired This is a description of queryParamInt64ArrayRequired, a
     *     required Int64 array query parameter (required)
     * @param queryParamFloatArrayRequired This is a description of queryParamFloatArrayRequired, a
     *     required float array query parameter (required)
     * @param queryParamDoubleArrayRequired This is a description of queryParamDoubleArrayRequired, a
     *     required double array query parameter (required)
     * @param queryParamBooleanArrayRequired This is a description of queryParamBooleanArrayRequired,
     *     a required boolean array query parameter (required)
     * @param queryParamStringArrayOptional This is a description of queryParamStringArrayOptional, an
     *     optional string array query parameter (optional, default to new
     *     java.util.ArrayList<String>())
     * @param queryParamIntArrayOptional This is a description of queryParamIntArrayOptional, an
     *     optional Int array query parameter (optional, default to new
     *     java.util.ArrayList<Integer>())
     * @param queryParamInt64ArrayOptional This is a description of queryParamInt64ArrayOptional, an
     *     optional Int64 array query parameter (optional, default to new java.util.ArrayList<Long>())
     * @param queryParamFloatArrayOptional This is a description of queryParamFloatArrayOptional, an
     *     optional float array query parameter (optional, default to new
     *     java.util.ArrayList<Float>())
     * @param queryParamDoubleArrayOptional This is a description of queryParamDoubleArrayOptional, an
     *     optional double array query parameter (optional, default to new
     *     java.util.ArrayList<Double>())
     * @param queryParamBooleanArrayOptional This is a description of queryParamBooleanArrayOptional,
     *     an optional boolean array query parameter (optional, default to new
     *     java.util.ArrayList<Boolean>())
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/arrays")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getParametersArrays(
            @javax.ws.rs.BeanParam GetParametersArraysParam params)
            throws javax.ws.rs.WebApplicationException;

    public class GetParametersArraysParam {

        @javax.ws.rs.QueryParam("queryParamStringArrayRequired")
        @javax.validation.constraints.NotNull
        public java.util.List<String> queryParamStringArrayRequired;

        @javax.ws.rs.QueryParam("queryParamIntArrayRequired")
        @javax.validation.constraints.NotNull
        public java.util.List<Integer> queryParamIntArrayRequired;

        @javax.ws.rs.QueryParam("queryParamInt64ArrayRequired")
        @javax.validation.constraints.NotNull
        public java.util.List<Long> queryParamInt64ArrayRequired;

        @javax.ws.rs.QueryParam("queryParamFloatArrayRequired")
        @javax.validation.constraints.NotNull
        public java.util.List<Float> queryParamFloatArrayRequired;

        @javax.ws.rs.QueryParam("queryParamDoubleArrayRequired")
        @javax.validation.constraints.NotNull
        public java.util.List<Double> queryParamDoubleArrayRequired;

        @javax.ws.rs.QueryParam("queryParamBooleanArrayRequired")
        @javax.validation.constraints.NotNull
        public java.util.List<Boolean> queryParamBooleanArrayRequired;

        @javax.ws.rs.QueryParam("queryParamStringArrayOptional")
        public java.util.List<String> queryParamStringArrayOptional;

        @javax.ws.rs.QueryParam("queryParamIntArrayOptional")
        public java.util.List<Integer> queryParamIntArrayOptional;

        @javax.ws.rs.QueryParam("queryParamInt64ArrayOptional")
        public java.util.List<Long> queryParamInt64ArrayOptional;

        @javax.ws.rs.QueryParam("queryParamFloatArrayOptional")
        public java.util.List<Float> queryParamFloatArrayOptional;

        @javax.ws.rs.QueryParam("queryParamDoubleArrayOptional")
        public java.util.List<Double> queryParamDoubleArrayOptional;

        @javax.ws.rs.QueryParam("queryParamBooleanArrayOptional")
        public java.util.List<Boolean> queryParamBooleanArrayOptional;
    }

    /**
     * Summary: This is an endpoint which tests collectionFormat. Description: This is an endpoint
     * which tests all of the values of collectionFormat on input array parameters.
     *
     * @param stringArrayCSV This is a description of stringArrayCSV, an optional array of strings
     *     query parameter which uses a comma delimiter. (optional, default to new
     *     java.util.ArrayList<String>())
     * @param stringArraySSV This is a description of stringArraySSV, an optional array of strings
     *     query parameter which uses a space delimiter. (optional, default to new
     *     java.util.ArrayList<String>())
     * @param stringArrayTSV This is a description of stringArrayTSV, an optional array of strings
     *     query parameter which uses a tab delimiter. (optional, default to new
     *     java.util.ArrayList<String>())
     * @param stringArrayPipes This is a description of stringArrayPipes, an optional array of strings
     *     query parameter which uses a | delimiter. (optional, default to new
     *     java.util.ArrayList<String>())
     * @param stringArrayMulti This is a description of stringArrayMulti, an optional array of strings
     *     query parameter which uses a separate query parameter for each element of the array.
     *     (optional, default to new java.util.ArrayList<String>())
     * @param stringArrayPipesOfStringArrayCSV This is an optional parameter which is a string array
     *     of string arrays. The outer delimiter is the pipe (&#39;|&#39;) and the inner delimiter is
     *     the comma (&#39;,&#39;). An example would be: &#39;a,b,c|d,e|f,g,h&#39;. (optional, default
     *     to new java.util.ArrayList<java.util.List<String>>())
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/arrays/collectionFormat")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>
    getParametersArraysCollectionFormat(
            @javax.ws.rs.BeanParam GetParametersArraysCollectionFormatParam params)
            throws javax.ws.rs.WebApplicationException;

    public class GetParametersArraysCollectionFormatParam {

        @javax.ws.rs.QueryParam("stringArrayCSV")
        public java.util.List<String> stringArrayCSV;

        @javax.ws.rs.QueryParam("stringArraySSV")
        public java.util.List<String> stringArraySSV;

        @javax.ws.rs.QueryParam("stringArrayTSV")
        public java.util.List<String> stringArrayTSV;

        @javax.ws.rs.QueryParam("stringArrayPipes")
        public java.util.List<String> stringArrayPipes;

        @javax.ws.rs.QueryParam("stringArrayMulti")
        public java.util.List<String> stringArrayMulti;

        @javax.ws.rs.QueryParam("stringArrayPipesOfStringArrayCSV")
        public java.util.List<java.util.List<String>> stringArrayPipesOfStringArrayCSV;
    }

    /**
     * Summary: This is an endpoint which tests parameters. Description: This is an endpoint which
     * tests input parameters.
     *
     * @param pathParam This is a description of pathParam, a path parameter. (required)
     * @param enumPathParam This is a description of enumPathParams, an Enum path parameter.
     *     (required)
     * @param queryParamStringRequired This is a required string parameter. (required)
     * @param queryParamNumberRequired This is a description of queryParamDoubleRequired, a required
     *     double query parameter (required)
     * @param queryParamUUIDRequired This is a required UUID parameter. (required)
     * @param queryParamFloatRequired This is a description of queryParamFloatRequired, a required
     *     float query parameter (required)
     * @param queryParamDoubleRequired This is a description of queryParamDoubleRequired, a required
     *     double query parameter (required)
     * @param queryParamIntRequired This is a description of queryParamIntRequired, a required integer
     *     query parameter (required)
     * @param queryParamInt64Required This is a description of queryParamInt64Required, a required
     *     integer query parameter (required)
     * @param queryParamBooleanRequired This is a description of queryParamBooleanRequired, a required
     *     boolean query parameter (required)
     * @param queryParamStringOptional This is an optional string parameter. It provides a default
     *     value. (optional, default to queryParamStringOptionalDefaultValue)
     * @param queryParamFloatOptional This is a description of queryParamFloatOptional, an optional
     *     float query parameter (optional, default to 1f)
     * @param queryParamDoubleOptional This is a description of queryParamDoubleOptional, an optional
     *     double query parameter (optional, default to 1d)
     * @param queryParamIntOptional This is a description of queryParamIntOptional, an optional
     *     integer query parameter (optional)
     * @param queryParamInt64Optional This is a description of queryParamInt64Optional, an optional
     *     integer query parameter (optional)
     * @param queryParamBooleanOptional This is a description of queryParamBooleanOptional, an
     *     optional boolean query parameter (optional, default to true)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/{pathParam}/all/{enumPathParam}")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getParametersScalars(
            @javax.ws.rs.BeanParam GetParametersScalarsParam params)
            throws javax.ws.rs.WebApplicationException;

    public class GetParametersScalarsParam {
        @javax.ws.rs.PathParam("pathParam")
        public String pathParam;

        @javax.ws.rs.PathParam("enumPathParam")
        public String enumPathParam;

        @javax.ws.rs.QueryParam("queryParamStringRequired")
        @javax.validation.constraints.NotNull
        public String queryParamStringRequired;

        @javax.ws.rs.QueryParam("queryParamNumberRequired")
        @javax.validation.constraints.NotNull
        public java.math.BigDecimal queryParamNumberRequired;

        @javax.ws.rs.QueryParam("queryParamUUIDRequired")
        @javax.validation.constraints.NotNull
        public java.util.UUID queryParamUUIDRequired;

        @javax.ws.rs.QueryParam("queryParamFloatRequired")
        @javax.validation.constraints.NotNull
        public Float queryParamFloatRequired;

        @javax.ws.rs.QueryParam("queryParamDoubleRequired")
        @javax.validation.constraints.NotNull
        public Double queryParamDoubleRequired;

        @javax.ws.rs.QueryParam("queryParamIntRequired")
        @javax.validation.constraints.NotNull
        public Integer queryParamIntRequired;

        @javax.ws.rs.QueryParam("queryParamInt64Required")
        @javax.validation.constraints.NotNull
        public Long queryParamInt64Required;

        @javax.ws.rs.QueryParam("queryParamBooleanRequired")
        @javax.validation.constraints.NotNull
        public Boolean queryParamBooleanRequired;

        @javax.ws.rs.QueryParam("queryParamStringOptional")
        @javax.ws.rs.DefaultValue("queryParamStringOptionalDefaultValue")
        public String queryParamStringOptional;

        @javax.ws.rs.QueryParam("queryParamFloatOptional")
        @javax.ws.rs.DefaultValue("1f")
        public Float queryParamFloatOptional;

        @javax.ws.rs.QueryParam("queryParamDoubleOptional")
        @javax.ws.rs.DefaultValue("1d")
        public Double queryParamDoubleOptional;

        @javax.ws.rs.QueryParam("queryParamIntOptional")
        public Integer queryParamIntOptional;

        @javax.ws.rs.QueryParam("queryParamInt64Optional")
        public Long queryParamInt64Optional;

        @javax.ws.rs.QueryParam("queryParamBooleanOptional")
        @javax.ws.rs.DefaultValue("true")
        public Boolean queryParamBooleanOptional;
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
     *     &#39;a,b,c,d&#39; would not. (optional, default to new java.util.ArrayList<String>())
     * @param stringArrayParameterWithMinItems This is a string array parameter with a minItems of 3
     *     and collectionFormat&#x3D;csv, so the number of elements in the comma-delimited string must
     *     be &gt;&#x3D; 3. So therefore &#39;a,b,c&#39; and &#39;a,b,c,d&#39; would pass validation
     *     but &#39;a,b&#39; would not. (optional, default to new java.util.ArrayList<String>())
     * @param stringArrayParameterWithUniqueItems This is a string array parameter with a
     *     uniqueItems&#x3D;true and collectionFormat&#x3D;csv. So therefore &#39;a,b,c&#39; and
     *     &#39;a,b,c,d&#39; would pass validation but &#39;a,b,a&#39; would not. (optional, default
     *     to new java.util.ArrayList<String>())
     * @param integerParameterWithMultipleOf This is an integer parameter with multipleOf&#x3D;10. So
     *     therefore values of 10, 100, and 10000 would pass validation but 25 would not. (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/parameters/validation")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getParametersValidation(
            @javax.ws.rs.BeanParam GetParametersValidationParam params)
            throws javax.ws.rs.WebApplicationException;

    public class GetParametersValidationParam {

        @javax.ws.rs.QueryParam("integerParameterWithInclusiveMaximum")
        @javax.validation.constraints.Max(10)
        public Integer integerParameterWithInclusiveMaximum;

        @javax.ws.rs.QueryParam("integerParameterWithExclusiveMaximum")
        @javax.validation.constraints.Max(10)
        public Integer integerParameterWithExclusiveMaximum;

        @javax.ws.rs.QueryParam("integerParameterWithInclusiveMinimum")
        @javax.validation.constraints.Min(10)
        public Integer integerParameterWithInclusiveMinimum;

        @javax.ws.rs.QueryParam("integerParameterWithExclusiveMinimum")
        @javax.validation.constraints.Min(10)
        public Integer integerParameterWithExclusiveMinimum;

        @javax.ws.rs.QueryParam("stringParameterWithMaxLength")
        @javax.validation.constraints.Size(max = 10)
        public String stringParameterWithMaxLength;

        @javax.ws.rs.QueryParam("stringParameterWithMinLength")
        @javax.validation.constraints.Size(min = 10)
        public String stringParameterWithMinLength;

        @javax.ws.rs.QueryParam("stringParameterWithPhoneNumberPattern")
        @javax.validation.constraints.Pattern(regexp = "^(\\([0-9]{3}\\))?[0-9]{3}-[0-9]{4}$")
        public String stringParameterWithPhoneNumberPattern;

        @javax.ws.rs.QueryParam("stringArrayParameterWithMaxItems")
        @javax.validation.constraints.Size(max = 3)
        public java.util.List<String> stringArrayParameterWithMaxItems;

        @javax.ws.rs.QueryParam("stringArrayParameterWithMinItems")
        @javax.validation.constraints.Size(min = 3)
        public java.util.List<String> stringArrayParameterWithMinItems;

        @javax.ws.rs.QueryParam("stringArrayParameterWithUniqueItems")
        public java.util.List<String> stringArrayParameterWithUniqueItems;

        @javax.ws.rs.QueryParam("integerParameterWithMultipleOf")
        public Integer integerParameterWithMultipleOf;
    }

    /**
     * Summary: This operation is for testing body input parameters. Description: This operation is
     * for testing an input parameter serialized in the body of the request.
     *
     * @param errorInfo This parameter will be serialized in the request body. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("test/parameters/body")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> postBodyParameterJSON(
            @javax.validation.constraints.NotNull @javax.validation.Valid ErrorInfo errorInfo)
            throws javax.ws.rs.WebApplicationException;

    /**
     * Summary: This endpoint is for testing multipart/form-data input parameters. Desciption: This
     * operation is for testing multipart/form-data input parameters.
     *
     * @param fileParam This is an in&#x3D;formData type&#x3D;file input parameter (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("test/parameters/multiPartFormData")
    @javax.ws.rs.Consumes({"multipart/form-data"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>
    postFormDataParameterMultipartFormData(
            @javax.ws.rs.BeanParam PostFormDataParameterMultipartFormDataParam params)
            throws javax.ws.rs.WebApplicationException;

    public class PostFormDataParameterMultipartFormDataParam {

        @javax.ws.rs.FormParam(value = "additionalMetadata")
        private String additionalMetadata;

        @javax.ws.rs.FormParam(value = "fileParam")
        public java.io.InputStream fileParamInputStream;
    }

    /**
     * Summary: This endpoint is for testing url-enoded input parameters. Desciption: This operation
     * is for testing url-encoded input parameters.
     *
     * @param stringParam This is an in&#x3D;body type&#x3D;string input parameter (optional)
     * @param numberParam This is an in&#x3D;body type&#x3D;number input parameter (optional)
     * @param integerParam This is an in&#x3D;body type&#x3D;integer input parameter (optional)
     * @param booleanParam This is an in&#x3D;body type&#x3D;boolean input parameter (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("test/parameters/urlEncoded")
    @javax.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> postFormDataParametersUrlEncoded(
            @javax.ws.rs.BeanParam PostFormDataParametersUrlEncodedParam params)
            throws javax.ws.rs.WebApplicationException;

    public class PostFormDataParametersUrlEncodedParam {}
}
