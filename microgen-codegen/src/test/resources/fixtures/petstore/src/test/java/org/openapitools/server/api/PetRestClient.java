package org.openapitools.server.api;

import org.openapitools.server.model.ModelApiResponse;
import org.openapitools.server.model.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@org.eclipse.microprofile.rest.client.inject.RegisterRestClient
@org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders
public interface PetRestClient extends java.lang.AutoCloseable {

    /**
     * Add a new pet to the store
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "POST_pet_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "addPet",
            reusable = false,
            tags = {"class=PetApi,method=addPet_AddPetParams"},
            description = "Add a new pet to the store")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "POST_pet_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "addPet",
            reusable = false,
            tags = {"class=PetApi,method=addPet_AddPetParams"},
            description = "Add a new pet to the store")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addPet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;

    /**
     * Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey (optional)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "DELETE_pet/{petId}_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "deletePet",
            reusable = false,
            tags = {"class=PetApi,method=deletePet_DeletePetParams"},
            description = "Deletes a pet")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "DELETE_pet/{petId}_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "deletePet",
            reusable = false,
            tags = {"class=PetApi,method=deletePet_DeletePetParams"},
            description = "Deletes a pet")
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("pet/{petId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deletePet(
            @javax.ws.rs.BeanParam DeletePetParams params) throws javax.ws.rs.WebApplicationException;

    class DeletePetParams {
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
     * Finds Pets by status Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;java.util.List&lt;Pet&gt;&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "GET_pet/findByStatus_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "findPetsByStatus",
            reusable = false,
            tags = {"class=PetApi,method=findPetsByStatus_FindPetsByStatusParams"},
            description = "Finds Pets by status")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "GET_pet/findByStatus_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "findPetsByStatus",
            reusable = false,
            tags = {"class=PetApi,method=findPetsByStatus_FindPetsByStatusParams"},
            description = "Finds Pets by status")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByStatus")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<java.util.List<Pet>> findPetsByStatus(
            @javax.ws.rs.BeanParam FindPetsByStatusParams params)
            throws javax.ws.rs.WebApplicationException;

    class FindPetsByStatusParams {

        @javax.ws.rs.QueryParam("status")
        @javax.validation.constraints.NotNull
        public java.util.List<String> status;

        public FindPetsByStatusParams status(final java.util.List<String> status) {
            this.status = status;
            return this;
        }
    }

    /**
     * Finds Pets by tags Muliple tags can be provided with comma separated strings. Use tag1, tag2,
     * tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;java.util.List&lt;Pet&gt;&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "GET_pet/findByTags_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "findPetsByTags",
            reusable = false,
            tags = {"class=PetApi,method=findPetsByTags_FindPetsByTagsParams"},
            description = "Finds Pets by tags")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "GET_pet/findByTags_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "findPetsByTags",
            reusable = false,
            tags = {"class=PetApi,method=findPetsByTags_FindPetsByTagsParams"},
            description = "Finds Pets by tags")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByTags")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<java.util.List<Pet>> findPetsByTags(
            @javax.ws.rs.BeanParam FindPetsByTagsParams params)
            throws javax.ws.rs.WebApplicationException;

    class FindPetsByTagsParams {

        @javax.ws.rs.QueryParam("tags")
        @javax.validation.constraints.NotNull
        public java.util.List<String> tags;

        public FindPetsByTagsParams tags(final java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
    }

    /**
     * Find pet by ID Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Pet&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "GET_pet/{petId}_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "getPetById",
            reusable = false,
            tags = {"class=PetApi,method=getPetById_GetPetByIdParams"},
            description = "Find pet by ID")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "GET_pet/{petId}_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "getPetById",
            reusable = false,
            tags = {"class=PetApi,method=getPetById_GetPetByIdParams"},
            description = "Find pet by ID")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<Pet> getPetById(
            @javax.ws.rs.BeanParam GetPetByIdParams params) throws javax.ws.rs.WebApplicationException;

    class GetPetByIdParams {
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
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "PUT_pet_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "updatePet",
            reusable = false,
            tags = {"class=PetApi,method=updatePet_UpdatePetParams"},
            description = "Update an existing pet")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "PUT_pet_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "updatePet",
            reusable = false,
            tags = {"class=PetApi,method=updatePet_UpdatePetParams"},
            description = "Update an existing pet")
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePet(
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;

    /**
     * Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "POST_pet/{petId}_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "updatePetWithForm",
            reusable = false,
            tags = {"class=PetApi,method=updatePetWithForm_UpdatePetWithFormParams"},
            description = "Updates a pet in the store with form data")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "POST_pet/{petId}_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "updatePetWithForm",
            reusable = false,
            tags = {"class=PetApi,method=updatePetWithForm_UpdatePetWithFormParams"},
            description = "Updates a pet in the store with form data")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePetWithForm(
            @javax.ws.rs.BeanParam UpdatePetWithFormParams params)
            throws javax.ws.rs.WebApplicationException;

    class UpdatePetWithFormParams {
        @javax.ws.rs.PathParam("petId")
        public Long petId;

        public UpdatePetWithFormParams petId(final Long petId) {
            this.petId = petId;
            return this;
        }
    }

    /**
     * uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return {@code java.util.concurrent.CompletionStage&lt;ModelApiResponse&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "POST_pet/{petId}/uploadImage_time",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "uploadFile",
            reusable = false,
            tags = {"class=PetApi,method=uploadFile_UploadFileParams"},
            description = "uploads an image")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "POST_pet/{petId}/uploadImage_count",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "uploadFile",
            reusable = false,
            tags = {"class=PetApi,method=uploadFile_UploadFileParams"},
            description = "uploads an image")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}/uploadImage")
    @javax.ws.rs.Consumes({"multipart/form-data"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<ModelApiResponse> uploadImage(
            @javax.ws.rs.BeanParam UploadFileParams params) throws javax.ws.rs.WebApplicationException;

    class UploadFileParams {
        @javax.ws.rs.PathParam("petId")
        public Long petId;

        public UploadFileParams petId(final Long petId) {
            this.petId = petId;
            return this;
        }

        @javax.ws.rs.FormParam(value = "additionalMetadata")
        public String additionalMetadata;

        public UploadFileParams additionalMetadata(final String additionalMetadata) {
            this.additionalMetadata = additionalMetadata;
            return this;
        }

        @javax.ws.rs.FormParam(value = "file")
        public java.io.InputStream fileInputStream;

        public UploadFileParams fileInputStream(final java.io.InputStream fileInputStream) {
            this.fileInputStream = fileInputStream;
            return this;
        }
    }
}
