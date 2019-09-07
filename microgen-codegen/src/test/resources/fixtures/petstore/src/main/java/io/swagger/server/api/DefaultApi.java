package io.swagger.server.api;

import io.swagger.server.model.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface DefaultApi {

    /**
     * Add a new default pet to the store
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addDefPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;

    /**
     * Update a new Default existing pet
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updateDefPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;
}
