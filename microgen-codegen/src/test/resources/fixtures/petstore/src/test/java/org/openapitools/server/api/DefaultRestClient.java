package org.openapitools.server.api;

import org.openapitools.server.model.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@org.eclipse.microprofile.rest.client.inject.RegisterRestClient
@org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders
public interface DefaultRestClient extends java.lang.AutoCloseable {

    /**
     * Add a new default pet to the store
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addDefPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;

    /**
     * Update a new Default existing pet
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updateDefPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;
}
