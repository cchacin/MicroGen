package petstore.api;

import petstore.models.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface PetApi { 

    /**
     * Add a new pet to the store
     * 
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({ "application/json", "application/xml" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addPet(
        
         @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet
    ) throws javax.ws.rs.WebApplicationException;

        


    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("pet/{petId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deletePet(
        @javax.ws.rs.BeanParam DeletePetParams params
        
    ) throws javax.ws.rs.WebApplicationException;

        public class DeletePetParams {
            @javax.ws.rs.PathParam("petId")
        
        public Long petId;

        public DeletePetParams petId(final Long petId) {
    this.petId = petId;
    return this;
}

    
    
    
    
    
            @javax.ws.rs.HeaderParam("api_key")
         
        
        public String apiKey;

        public DeletePetParams apiKey(final String apiKey) {
    this.apiKey = apiKey;
    return this;
}

    
}



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
        @javax.ws.rs.BeanParam FindPetsByStatusParams params
        
    ) throws javax.ws.rs.WebApplicationException;

        public class FindPetsByStatusParams {
    
            @javax.ws.rs.QueryParam("status")
         @javax.validation.constraints.NotNull 
        
        public java.util.List<String> status;

        public FindPetsByStatusParams status(final java.util.List<String> status) {
    this.status = status;
    return this;
}

    
    
}



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
        @javax.ws.rs.BeanParam FindPetsByTagsParams params
        
    ) throws javax.ws.rs.WebApplicationException;

        public class FindPetsByTagsParams {
    
            @javax.ws.rs.QueryParam("tags")
         @javax.validation.constraints.NotNull 
        
        public java.util.List<String> tags;

        public FindPetsByTagsParams tags(final java.util.List<String> tags) {
    this.tags = tags;
    return this;
}

    
    
}



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
        @javax.ws.rs.BeanParam GetPetByIdParams params
        
    ) throws javax.ws.rs.WebApplicationException;

        public class GetPetByIdParams {
            @javax.ws.rs.PathParam("petId")
        
        public Long petId;

        public GetPetByIdParams petId(final Long petId) {
    this.petId = petId;
    return this;
}

    
    
    
}



    /**
     * Update an existing pet
     * 
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({ "application/json", "application/xml" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePet(
        
         @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet
    ) throws javax.ws.rs.WebApplicationException;

        


    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Consumes({ "application/x-www-form-urlencoded" })
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePetWithForm(
        @javax.ws.rs.BeanParam UpdatePetWithFormParams params
        
    ) throws javax.ws.rs.WebApplicationException;

        public class UpdatePetWithFormParams {
            @javax.ws.rs.PathParam("petId")
        
        public Long petId;

        public UpdatePetWithFormParams petId(final Long petId) {
    this.petId = petId;
    return this;
}

    
    
    
    
    
    
    

    
    
    
    

}

} 