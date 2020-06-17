package org.openapitools.server.model;

public class UserSerializer
        implements javax.json.bind.serializer.JsonbSerializer<User>,
        javax.json.bind.serializer.JsonbDeserializer<User> {

    @Override
    public void serialize(
            User obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
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
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static User fromJsonObject(final javax.json.JsonObject jsonObject) {
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

    public static java.util.List<User> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
