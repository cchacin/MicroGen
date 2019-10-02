package org.openapitools.server.api;

import org.openapitools.server.model.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@javax.enterprise.context.Dependent
@org.eclipse.microprofile.rest.client.inject.RegisterRestClient
@org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders
public interface DefaultRestClient extends java.lang.AutoCloseable {

    /**
     * Add a new default pet to the store
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "POST_defaultpet",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "addDefPet",
        reusable = false,
        tags = {"action=DefaultApi.addDefPet"},
        description = "Add a new default pet to the store")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "POST_defaultpet",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "addDefPet",
        reusable = false,
        tags = {"action=DefaultApi.addDefPet"},
        description = "Add a new default pet to the store")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<Void> addDefPet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
        throws javax.ws.rs.WebApplicationException;

    public class AddDefPetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public AddDefPetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public AddDefPetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Update a new Default existing pet
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "PUT_defaultpet",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "updateDefPet",
        reusable = false,
        tags = {"action=DefaultApi.updateDefPet"},
        description = "Update a new Default existing pet")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "PUT_defaultpet",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "updateDefPet",
        reusable = false,
        tags = {"action=DefaultApi.updateDefPet"},
        description = "Update a new Default existing pet")
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json", "application/xml"})
    java.util.concurrent.CompletionStage<Void> updateDefPet(
        @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
        throws javax.ws.rs.WebApplicationException;

    public class UpdateDefPetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public UpdateDefPetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public UpdateDefPetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }
}
