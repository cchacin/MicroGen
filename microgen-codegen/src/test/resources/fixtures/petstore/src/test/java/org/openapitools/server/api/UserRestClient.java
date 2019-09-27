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
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> createUser(
        @javax.validation.constraints.NotNull @javax.validation.Valid User user)
        throws javax.ws.rs.WebApplicationException;

    public class CreateUserParams {
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
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithArray")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> createUsersWithArrayInput(
        @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> user)
        throws javax.ws.rs.WebApplicationException;

    public class CreateUsersWithArrayInputParams {
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
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("user/createWithList")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> createUsersWithListInput(
        @javax.validation.constraints.NotNull @javax.validation.Valid java.util.List<User> user)
        throws javax.ws.rs.WebApplicationException;

    public class CreateUsersWithListInputParams {
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
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.DELETE
    @javax.ws.rs.Path("user/{username}")
    java.util.concurrent.CompletionStage<Void> deleteUser(
        @javax.ws.rs.BeanParam DeleteUserParams params) throws javax.ws.rs.WebApplicationException;

    public class DeleteUserParams {
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
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<User> getUserByName(
        @javax.ws.rs.BeanParam GetUserByNameParams params) throws javax.ws.rs.WebApplicationException;

    public class GetUserByNameParams {
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
    @javax.ws.rs.Produces({"application/xml", "application/json"})
    java.util.concurrent.CompletionStage<String> loginUser(
        @javax.ws.rs.BeanParam LoginUserParams params) throws javax.ws.rs.WebApplicationException;

    public class LoginUserParams {
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
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.GET
    @javax.ws.rs.Path("user/logout")
    java.util.concurrent.CompletionStage<Void> logoutUser()
        throws javax.ws.rs.WebApplicationException;

    public class LogoutUserParams {
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
     * @return {@code java.util.concurrent.CompletionStage&lt;Void&gt;}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("user/{username}")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<Void> updateUser(
        @javax.ws.rs.BeanParam UpdateUserParams params,
        @javax.validation.constraints.NotNull @javax.validation.Valid User user)
        throws javax.ws.rs.WebApplicationException;

    public class UpdateUserParams {
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
