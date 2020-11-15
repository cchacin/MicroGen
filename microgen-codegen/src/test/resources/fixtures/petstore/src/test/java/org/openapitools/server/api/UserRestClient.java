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
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> createUser(
            @javax.ws.rs.BeanParam CreateUserParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid User user)
            throws javax.ws.rs.WebApplicationException;

    class CreateUserParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public CreateUserParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public CreateUserParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Creates list of users with given input array
     *
     * @param user List of user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithArray")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> createUsersWithArrayInput(
            @javax.ws.rs.BeanParam CreateUsersWithArrayInputParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> user)
            throws javax.ws.rs.WebApplicationException;

    class CreateUsersWithArrayInputParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public CreateUsersWithArrayInputParams coreHttpHeaders(
                final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public CreateUsersWithArrayInputParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Creates list of users with given input array
     *
     * @param user List of user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithList")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> createUsersWithListInput(
            @javax.ws.rs.BeanParam CreateUsersWithListInputParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> user)
            throws javax.ws.rs.WebApplicationException;

    class CreateUsersWithListInputParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public CreateUsersWithListInputParams coreHttpHeaders(
                final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public CreateUsersWithListInputParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Delete user This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("user/{username}")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> deleteUser(
            @javax.ws.rs.BeanParam DeleteUserParams params) throws javax.ws.rs.WebApplicationException;

    class DeleteUserParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public DeleteUserParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public DeleteUserParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<User> getUserByName(
            @javax.ws.rs.BeanParam GetUserByNameParams params) throws javax.ws.rs.WebApplicationException;

    class GetUserByNameParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public GetUserByNameParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public GetUserByNameParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/login")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<String> loginUser(
            @javax.ws.rs.BeanParam LoginUserParams params) throws javax.ws.rs.WebApplicationException;

    class LoginUserParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public LoginUserParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public LoginUserParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

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
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/logout")
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> logoutUser()
            throws javax.ws.rs.WebApplicationException;

    class LogoutUserParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public LogoutUserParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public LogoutUserParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Updated user This can only be done by the logged in user.
     *
     * @param username name that need to be updated (required)
     * @param user Updated user object (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updateUser(
            @javax.ws.rs.BeanParam UpdateUserParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid User user)
            throws javax.ws.rs.WebApplicationException;

    class UpdateUserParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public UpdateUserParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public UpdateUserParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

        @javax.ws.rs.PathParam("username")
        public String username;

        public UpdateUserParams username(final String username) {
            this.username = username;
            return this;
        }
    }
}
