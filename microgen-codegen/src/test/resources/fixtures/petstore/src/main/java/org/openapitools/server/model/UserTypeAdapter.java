package org.openapitools.server.model;

public class UserTypeAdapter implements javax.json.bind.adapter.JsonbAdapter<User, ImmutableUser> {

    @Override
    public ImmutableUser adaptToJson(User obj) throws Exception {
        return ImmutableUser.copyOf(obj);
    }

    @Override
    public User adaptFromJson(ImmutableUser obj) throws Exception {
        return obj;
    }
}
