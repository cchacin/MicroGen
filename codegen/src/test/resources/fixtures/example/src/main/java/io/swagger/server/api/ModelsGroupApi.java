package io.swagger.server.api;

import io.swagger.server.model.AllModels;
import io.swagger.server.model.ErrorInfo;
import io.swagger.server.model.ModelWithReadOnlyPropertyTest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public interface ModelsGroupApi {

    /**
     * Return all of the defined models. This operation returns an AllModels object, which contains
     * all of the defined models.
     *
     * @param clientId        Unique string which defines the platform and version. Defined in
     *                        schema-level parameters section. (required)
     * @param clientVersionId Human readable major.minor string which defines the version. Defined
     *                        in schema-level parameters section. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/models/all")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getAllModels(
            @javax.ws.rs.BeanParam GetAllModelsParam params) throws javax.ws.rs.WebApplicationException;

    public class GetAllModelsParam {

        @javax.ws.rs.QueryParam("client_id")
        private String clientId;

        @javax.ws.rs.QueryParam("client_version_id")
        private String clientVersionId;
    }

    /**
     * This operation has a default response. This operation has a default response, and we test if
     * the default response is returned if an HTTP status code that is not specified is
     * encountered.
     *
     * @param clientId        Unique string which defines the platform and version. Defined in
     *                        schema-level parameters section. (required)
     * @param clientVersionId Human readable major.minor string which defines the version. Defined
     *                        in schema-level parameters section. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/operations/defaultResponse")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getDefaultResponse(
            @javax.ws.rs.BeanParam GetDefaultResponseParam params)
            throws javax.ws.rs.WebApplicationException;

    public class GetDefaultResponseParam {

        @javax.ws.rs.QueryParam("client_id")
        private String clientId;

        @javax.ws.rs.QueryParam("client_version_id")
        private String clientVersionId;
    }

    /**
     * Summary: This is an endpoint which tests readOnly properties. Description: This is an
     * endpoint which tests posting and receiving a model object which has readOnly properties. The
     * readOnly properties should be included in the response but not the request.
     *
     * @param body This is json-serialized property in the body. (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("test/models/readonly")
    @javax.ws.rs.Consumes({"application/json"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> putModelsReadOnly(
            @javax.validation.constraints.NotNull @javax.validation.Valid
                    ModelWithReadOnlyPropertyTest body) throws javax.ws.rs.WebApplicationException;
}
