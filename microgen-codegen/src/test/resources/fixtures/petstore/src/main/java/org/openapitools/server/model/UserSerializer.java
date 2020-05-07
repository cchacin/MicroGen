package org.openapitools.server.model;

public static class UserSerializer
        implements javax.json.bind.serializer.JsonbSerializer<User>,
        javax.json.bind.serializer.JsonbDeserializer<User> {

    @Override
    public void serialize(User obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("id", obj.getId(), generator);
        ctx.serialize("username", obj.getUsername(), generator);
        ctx.serialize("firstName", obj.getFirstName(), generator);
        ctx.serialize("lastName", obj.getLastName(), generator);
        ctx.serialize("email", obj.getEmail(), generator);
        ctx.serialize("password", obj.getPassword(), generator);
        ctx.serialize("phone", obj.getPhone(), generator);
        ctx.serialize("userStatus", obj.getUserStatus(), generator);
        generator.writeEnd();
    }

    @Override
    public User deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return User.builder()
                .id(jsonObject.getJsonNumber("id").longValue())
                .username(jsonObject.getString("username"))
                .firstName(jsonObject.getString("firstName"))
                .lastName(jsonObject.getString("lastName"))
                .email(jsonObject.getString("email"))
                .password(jsonObject.getString("password"))
                .phone(jsonObject.getString("phone"))
                .userStatus(jsonObject.getJsonNumber("userStatus").intValue())
                .build();
    }
}
