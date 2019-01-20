package io.swagger.server.api;

import io.swagger.server.model.ModelApiResponse;
import io.swagger.server.model.Pet;

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
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet body)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Deletes a pet
     *
     * @param apiKey (optional)
     * @param petId Pet id to delete (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("pet/{petId}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deletePet(
        @javax.ws.rs.BeanParam DeletePetParam params) throws javax.ws.rs.WebApplicationException;

    public class DeletePetParam {

        @javax.ws.rs.HeaderParam("api_key")
        private String apiKey;

        @javax.ws.rs.PathParam("petId")
        private Long petId;
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
        @javax.ws.rs.BeanParam FindPetsByStatusParam params)
        throws javax.ws.rs.WebApplicationException;

    public class FindPetsByStatusParam {

        @javax.ws.rs.QueryParam("status")
        private java.util.List<String> status;
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
        @javax.ws.rs.BeanParam FindPetsByTagsParam params) throws javax.ws.rs.WebApplicationException;

    public class FindPetsByTagsParam {

        @javax.ws.rs.QueryParam("tags")
        private java.util.List<String> tags;
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
        @javax.ws.rs.BeanParam GetPetByIdParam params) throws javax.ws.rs.WebApplicationException;

    public class GetPetByIdParam {
        @javax.ws.rs.PathParam("petId")
        private Long petId;
    }

    /**
     * Update an existing pet
     *
     * @param body Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("pet")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet body)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Updates a pet in the store with form data
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name (optional)
     * @param status (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}")
    @javax.ws.rs.Consumes({"application/x-www-form-urlencoded"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updatePetWithForm(
        @javax.ws.rs.BeanParam UpdatePetWithFormParam params)
        throws javax.ws.rs.WebApplicationException;

    public class UpdatePetWithFormParam {
        @javax.ws.rs.PathParam("petId")
        private Long petId;

        @javax.ws.rs.FormParam(value = "name")
        private String name;

        @javax.ws.rs.FormParam(value = "status")
        private String status;
    }

    /**
     * uploads an image
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata (optional)
     * @param file (optional)
     * @return {@code java.util.concurrent.CompletionStage<javax.ws.rs.core.Response>}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("pet/{petId}/uploadImage")
    @javax.ws.rs.Consumes({"multipart/form-data"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> uploadImage(
        @javax.ws.rs.BeanParam UploadFileParam params) throws javax.ws.rs.WebApplicationException;

    public class UploadFileParam {
        @javax.ws.rs.PathParam("petId")
        private Long petId;

        @javax.ws.rs.FormParam(value = "additionalMetadata")
        private String additionalMetadata;

        @javax.ws.rs.FormParam(value = "file")
        private byte[] file;
    }
}
