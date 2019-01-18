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

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class DeletePetParam {

        @javax.ws.rs.HeaderParam("api_key")
        public abstract String apiKey();

        @javax.ws.rs.PathParam("petId")
        public abstract Long petId();

        public static class Builder extends DeletePetParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
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

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class FindPetsByStatusParam {

        @javax.ws.rs.QueryParam("status")
        public abstract java.util.List<String> status();

        public static class Builder extends FindPetsByStatusParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
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

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class FindPetsByTagsParam {

        @javax.ws.rs.QueryParam("tags")
        public abstract java.util.List<String> tags();

        public static class Builder extends FindPetsByTagsParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
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

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class GetPetByIdParam {
        @javax.ws.rs.PathParam("petId")
        public abstract Long petId();

        public static class Builder extends GetPetByIdParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
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

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class UpdatePetWithFormParam {
        @javax.ws.rs.PathParam("petId")
        public abstract Long petId();

        @javax.ws.rs.FormParam(value = "name")
        public abstract String name();

        @javax.ws.rs.FormParam(value = "status")
        public abstract String status();

        public static class Builder extends UpdatePetWithFormParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
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

    @org.immutables.value.Value.Immutable
    @org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = org.immutables.value.Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = org.immutables.value.Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        jdkOnly = true)
    public abstract static class UploadFileParam {
        @javax.ws.rs.PathParam("petId")
        public abstract Long petId();

        @javax.ws.rs.FormParam(value = "additionalMetadata")
        public abstract String additionalMetadata();

        @javax.ws.rs.FormParam(value = "file")
        public abstract byte[] file();

        public static class Builder extends UploadFileParamInternalBuilder {}

        public static Builder builder() {
            return new Builder();
        }
    }
}
