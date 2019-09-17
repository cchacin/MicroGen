package org.openapitools.server.api;

import org.openapitools.server.model.ModelWithReadOnlyPropertyTest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface ModelsGroupApi {

    /**
     * Return all of the defined models. This operation returns an AllModels object, which contains
     * all of the defined models.
     *
     * @param clientId Unique string which defines the platform and version. Defined in schema-level
     *     parameters section. (required)
     * @param clientVersionId Human readable major.minor string which defines the version. Defined in
     *     schema-level parameters section. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/models/all")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getAllModels(
        @javax.ws.rs.BeanParam GetAllModelsParams params) throws javax.ws.rs.WebApplicationException;

    public class GetAllModelsParams {

        @javax.ws.rs.QueryParam("client_id")
        @javax.validation.constraints.NotNull
        public String clientId;

        @javax.ws.rs.QueryParam("client_version_id")
        @javax.validation.constraints.NotNull
        public String clientVersionId;
    }

    /**
     * This operation has a default response. This operation has a default response, and we test if
     * the default response is returned if an HTTP status code that is not specified is encountered.
     *
     * @param clientId Unique string which defines the platform and version. Defined in schema-level
     *     parameters section. (required)
     * @param clientVersionId Human readable major.minor string which defines the version. Defined in
     *     schema-level parameters section. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/operations/defaultResponse")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getDefaultResponse(
        @javax.ws.rs.BeanParam GetDefaultResponseParams params)
        throws javax.ws.rs.WebApplicationException;

    public class GetDefaultResponseParams {

        @javax.ws.rs.QueryParam("client_id")
        @javax.validation.constraints.NotNull
        public String clientId;

        @javax.ws.rs.QueryParam("client_version_id")
        @javax.validation.constraints.NotNull
        public String clientVersionId;
    }

    /**
     * Summary: This is an endpoint which tests readOnly properties. Description: This is an endpoint
     * which tests posting and receiving a model object which has readOnly properties. The readOnly
     * properties should be included in the response but not the request.
     *
     * @param modelWithReadOnlyPropertyTest This is json-serialized property in the body. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("test/models/readonly")
    @javax.ws.rs.Consumes({"application/json"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> putModelsReadOnly(
        @javax.validation.constraints.NotNull @javax.validation.Valid
            ModelWithReadOnlyPropertyTest modelWithReadOnlyPropertyTest)
        throws javax.ws.rs.WebApplicationException;
}
