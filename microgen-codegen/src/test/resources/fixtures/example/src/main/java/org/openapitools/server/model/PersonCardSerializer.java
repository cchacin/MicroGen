package org.openapitools.server.model;

public static class PersonCardSerializer
        implements javax.json.bind.serializer.JsonbSerializer<PersonCard>,
        javax.json.bind.serializer.JsonbDeserializer<PersonCard> {

    @Override
    public void serialize(
            PersonCard obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("firstName", obj.getFirstName(), generator);
        ctx.serialize("lastName", obj.getLastName(), generator);
        generator.writeEnd();
    }

    @Override
    public PersonCard deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJson(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static PersonCard fromJsonObject(final javax.json.JsonObject jsonObject) {
        return PersonCard.builder()
                .firstName(jsonObject.getString("firstName"))
                .lastName(jsonObject.getString("lastName"))
                .build();
    }

    public static java.util.List<PersonCard> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
