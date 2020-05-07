package org.openapitools.server.model;

public static class PersonCardSerializer
        implements javax.json.bind.serializer.JsonbSerializer<PersonCard>,
        javax.json.bind.serializer.JsonbDeserializer<PersonCard> {

    @Override
    public void serialize(PersonCard obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("firstName", obj.getFirstName(), generator);
        ctx.serialize("lastName", obj.getLastName(), generator);
        generator.writeEnd();
    }

    @Override
    public PersonCard deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return PersonCard.builder()
                .firstName(jsonObject.getString("firstName"))
                .lastName(jsonObject.getString("lastName"))
                .build();
    }
}
