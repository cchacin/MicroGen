package org.openapitools.server.api;

import org.openapitools.server.model.Pet;

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
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addPet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("pet/{petId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deletePet(
        @javax.ws.rs.BeanParam DeletePetParams params) throws javax.ws.rs.WebApplicationException;

    public class DeletePetParams {
        @javax.ws.rs.PathParam("petId")
        public Long petId;

        @javax.ws.rs.HeaderParam("api_key")
        public String apiKey;
    }

    /**
     * Finds Pets by status Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByStatus")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> findPetsByStatus(
        @javax.ws.rs.BeanParam FindPetsByStatusParams params)
        throws javax.ws.rs.WebApplicationException;

    public class FindPetsByStatusParams {

        @javax.ws.rs.QueryParam("status")
        @javax.validation.constraints.NotNull
        public java.util.List<String> status;
    }

    /**
     * Finds Pets by tags Muliple tags can be provided with comma separated strings. Use tag1, tag2,
     * tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByTags")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> findPetsByTags(
        @javax.ws.rs.BeanParam FindPetsByTagsParams params)
        throws javax.ws.rs.WebApplicationException;

    public class FindPetsByTagsParams {

        @javax.ws.rs.QueryParam("tags")
        @javax.validation.constraints.NotNull
        public java.util.List<String> tags;
    }

    /**
     * Find pet by ID Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getPetById(
        @javax.ws.rs.BeanParam GetPetByIdParams params) throws javax.ws.rs.WebApplicationException;

    public class GetPetByIdParams {
        @javax.ws.rs.PathParam("petId")
        public Long petId;
    }

    /**
     * Update an existing pet
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
        throws javax.ws.rs.WebApplicationException;

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
    @javax.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePetWithForm(
        @javax.ws.rs.BeanParam UpdatePetWithFormParams params)
        throws javax.ws.rs.WebApplicationException;

    public class UpdatePetWithFormParams {
        @javax.ws.rs.PathParam("petId")
        public Long petId;
    }

    /**
     * uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}/uploadImage")
    @javax.ws.rs.Consumes({"multipart/form-data"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> uploadImage(
        @javax.ws.rs.BeanParam UploadFileParams params) throws javax.ws.rs.WebApplicationException;

    public class UploadFileParams {
        @javax.ws.rs.PathParam("petId")
        public Long petId;

        @javax.ws.rs.FormParam(value = "additionalMetadata")
        public String additionalMetadata;

        @javax.ws.rs.FormParam(value = "file")
        public java.io.InputStream fileInputStream;
    }
}
