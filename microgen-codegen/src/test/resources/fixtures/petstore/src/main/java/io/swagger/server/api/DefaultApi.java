package io.swagger.server.api;

import io.swagger.server.model.Pet;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public interface DefaultApi {

    /**
     * Add a new default pet to the store
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addDefPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet body)
            throws javax.ws.rs.WebApplicationException;

    /**
     * Update a new Default existing pet
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updateDefPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet body)
            throws javax.ws.rs.WebApplicationException;
}
