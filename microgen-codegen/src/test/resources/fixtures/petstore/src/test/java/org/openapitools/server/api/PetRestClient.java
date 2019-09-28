package org.openapitools.server.api;

import org.openapitools.server.model.ModelApiResponse;
import org.openapitools.server.model.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@javax.enterprise.context.Dependent
@org.eclipse.microprofile.rest.client.inject.RegisterRestClient
@org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders
public interface PetRestClient extends java.lang.AutoCloseable {

    /**
     * Add a new pet to the store
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<Void> addPet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
        throws javax.ws.rs.WebApplicationException;

    public class AddPetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public AddPetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public AddPetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Deletes a pet
     *
     * @param petId Pet id to delete (required)
     * @param apiKey (optional)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("pet/{petId}")
    java.util.concurrent.CompletionStage<Void> deletePet(
        @javax.ws.rs.BeanParam DeletePetParams params) throws javax.ws.rs.WebApplicationException;

    public class DeletePetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public DeletePetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public DeletePetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByStatus")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<java.util.List<Pet>> findPetsByStatus(
        @javax.ws.rs.BeanParam FindPetsByStatusParams params)
        throws javax.ws.rs.WebApplicationException;

    public class FindPetsByStatusParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public FindPetsByStatusParams coreHttpHeaders(
            final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public FindPetsByStatusParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/findByTags")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<java.util.List<Pet>> findPetsByTags(
        @javax.ws.rs.BeanParam FindPetsByTagsParams params)
        throws javax.ws.rs.WebApplicationException;

    public class FindPetsByTagsParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public FindPetsByTagsParams coreHttpHeaders(
            final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public FindPetsByTagsParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
    @javax.ws.rs.GET
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<Pet> getPetById(
        @javax.ws.rs.BeanParam GetPetByIdParams params) throws javax.ws.rs.WebApplicationException;

    public class GetPetByIdParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public GetPetByIdParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public GetPetByIdParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("pet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<Void> updatePet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
        throws javax.ws.rs.WebApplicationException;

    public class UpdatePetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public UpdatePetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public UpdatePetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    java.util.concurrent.CompletionStage<Void> updatePetWithForm(
        @javax.ws.rs.BeanParam UpdatePetWithFormParams params)
        throws javax.ws.rs.WebApplicationException;

    public class UpdatePetWithFormParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public UpdatePetWithFormParams coreHttpHeaders(
            final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public UpdatePetWithFormParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}/uploadImage")
    @javax.ws.rs.Consumes({"multipart/form-data"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<ModelApiResponse> uploadImage(
        @javax.ws.rs.BeanParam UploadFileParams params) throws javax.ws.rs.WebApplicationException;

    public class UploadFileParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public UploadFileParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public UploadFileParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
