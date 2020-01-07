package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class UserTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<User, ImmutableUser> {

    @Override
    public ImmutableUser adaptToJson(User obj) throws Exception {
        return ImmutableUser.copyOf(obj);
    }

    @Override
    public User adaptFromJson(ImmutableUser obj) throws Exception {
        return obj;
    }
}
