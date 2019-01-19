package petstore.api;

import petstore.models.Pet;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public interface PetApi { 

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addPet(
         @javax.validation.constraints.NotNull @javax.validation.Valid Pet body) throws javax.ws.rs.WebApplicationException; 

    /**
     * Deletes a pet
     * 
     * @param apiKey  (optional)
     * @param petId Pet id to delete (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("pet/{petId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deletePet(
        @javax.ws.rs.HeaderParam("api_key")  String apiKey,@javax.ws.rs.PathParam("petId") Long petId) throws javax.ws.rs.WebApplicationException; 

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByStatus")
    @javax.ws.rs.Produces({ "application/xml", "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> findPetsByStatus(
        @javax.ws.rs.QueryParam("status") java.util.List<String> status) throws javax.ws.rs.WebApplicationException; 

    /**
     * Finds Pets by tags
     * Muliple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByTags")
    @javax.ws.rs.Produces({ "application/xml", "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> findPetsByTags(
        @javax.ws.rs.QueryParam("tags") java.util.List<String> tags) throws javax.ws.rs.WebApplicationException; 

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Produces({ "application/xml", "application/json" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getPetById(
        @javax.ws.rs.PathParam("petId") Long petId) throws javax.ws.rs.WebApplicationException; 

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("pet")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePet(
         @javax.validation.constraints.NotNull @javax.validation.Valid Pet body) throws javax.ws.rs.WebApplicationException; 

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name  (optional)
     * @param status  (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Consumes({ "application/x-www-form-urlencoded" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePetWithForm(
        @javax.ws.rs.PathParam("petId") Long petId,@javax.ws.rs.FormParam(value = "name")  String name,@javax.ws.rs.FormParam(value = "status")  String status) throws javax.ws.rs.WebApplicationException; 
} 