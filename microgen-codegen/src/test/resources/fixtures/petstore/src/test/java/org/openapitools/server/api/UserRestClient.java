package org.openapitools.server.api;

import org.openapitools.server.model.User;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
@org.eclipse.microprofile.rest.client.inject.RegisterRestClient
@org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders
public interface UserRestClient extends java.lang.AutoCloseable {

    /**
     * Create user This can only be done by the logged in user.
     *
     * @param user Created user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "POST_user",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "createUser",
        reusable = false,
        tags = {"action=UserApi.createUser"},
        description = "Create user")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "POST_user",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "createUser",
        reusable = false,
        tags = {"action=UserApi.createUser"},
        description = "Create user")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> createUser(
        @javax.validation.constraints.NotNull @javax.validation.Valid User user)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Creates list of users with given input array
     *
     * @param user List of user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "POST_user/createWithArray",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "createUsersWithArrayInput",
        reusable = false,
        tags = {"action=UserApi.createUsersWithArrayInput"},
        description = "Creates list of users with given input array")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "POST_user/createWithArray",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "createUsersWithArrayInput",
        reusable = false,
        tags = {"action=UserApi.createUsersWithArrayInput"},
        description = "Creates list of users with given input array")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithArray")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> createUsersWithArrayInput(
        @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> user)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Creates list of users with given input array
     *
     * @param user List of user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "POST_user/createWithList",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "createUsersWithListInput",
        reusable = false,
        tags = {"action=UserApi.createUsersWithListInput"},
        description = "Creates list of users with given input array")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "POST_user/createWithList",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "createUsersWithListInput",
        reusable = false,
        tags = {"action=UserApi.createUsersWithListInput"},
        description = "Creates list of users with given input array")
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithList")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> createUsersWithListInput(
        @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> user)
        throws javax.ws.rs.WebApplicationException;

    /**
     * Delete user This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "DELETE_user/{username}",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "deleteUser",
        reusable = false,
        tags = {"action=UserApi.deleteUser"},
        description = "Delete user")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "DELETE_user/{username}",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "deleteUser",
        reusable = false,
        tags = {"action=UserApi.deleteUser"},
        description = "Delete user")
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("user/{username}")
    java.util.concurrent.CompletionStage<Void> deleteUser(
        @javax.ws.rs.BeanParam DeleteUserParams params) throws javax.ws.rs.WebApplicationException;

    class DeleteUserParams {
        @javax.ws.rs.PathParam("username")
        public String username;

        public DeleteUserParams username(final String username) {
            this.username = username;
            return this;
        }
    }

    /**
     * Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing. (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;User&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "GET_user/{username}",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "getUserByName",
        reusable = false,
        tags = {"action=UserApi.getUserByName"},
        description = "Get user by user name")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "GET_user/{username}",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "getUserByName",
        reusable = false,
        tags = {"action=UserApi.getUserByName"},
        description = "Get user by user name")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<User> getUserByName(
        @javax.ws.rs.BeanParam GetUserByNameParams params) throws javax.ws.rs.WebApplicationException;

    class GetUserByNameParams {
        @javax.ws.rs.PathParam("username")
        public String username;

        public GetUserByNameParams username(final String username) {
            this.username = username;
            return this;
        }
    }

    /**
     * Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;String&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "GET_user/login",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "loginUser",
        reusable = false,
        tags = {"action=UserApi.loginUser"},
        description = "Logs user into the system")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "GET_user/login",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "loginUser",
        reusable = false,
        tags = {"action=UserApi.loginUser"},
        description = "Logs user into the system")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/login")
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<String> loginUser(
        @javax.ws.rs.BeanParam LoginUserParams params) throws javax.ws.rs.WebApplicationException;

    class LoginUserParams {

        @javax.ws.rs.QueryParam("username")
        @javax.validation.constraints.NotNull
        public String username;

        public LoginUserParams username(final String username) {
            this.username = username;
            return this;
        }

        @javax.ws.rs.QueryParam("password")
        @javax.validation.constraints.NotNull
        public String password;

        public LoginUserParams password(final String password) {
            this.password = password;
            return this;
        }
    }

    /**
     * Logs out current logged in user session
     *
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "GET_user/logout",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "logoutUser",
        reusable = false,
        tags = {"action=UserApi.logoutUser"},
        description = "Logs out current logged in user session")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "GET_user/logout",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "logoutUser",
        reusable = false,
        tags = {"action=UserApi.logoutUser"},
        description = "Logs out current logged in user session")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/logout")
    java.util.concurrent.CompletionStage<Void> logoutUser()
        throws javax.ws.rs.WebApplicationException;

    /**
     * Updated user This can only be done by the logged in user.
     *
     * @param username name that need to be updated (required)
     * @param user Updated user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
        name = "PUT_user/{username}",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
        displayName = "updateUser",
        reusable = false,
        tags = {"action=UserApi.updateUser"},
        description = "Updated user")
    @org.eclipse.microprofile.metrics.annotation.Counted(
        name = "PUT_user/{username}",
        absolute = true,
        unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
        displayName = "updateUser",
        reusable = false,
        tags = {"action=UserApi.updateUser"},
        description = "Updated user")
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> updateUser(
        @javax.ws.rs.BeanParam UpdateUserParams params,
        @javax.validation.constraints.NotNull @javax.validation.Valid User user)
        throws javax.ws.rs.WebApplicationException;

    class UpdateUserParams {
        @javax.ws.rs.PathParam("username")
        public String username;

        public UpdateUserParams username(final String username) {
            this.username = username;
            return this;
        }
    }
}
