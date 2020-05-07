package org.openapitools.server.model;

public static class SampleSubClassSerializer
        implements javax.json.bind.serializer.JsonbSerializer<SampleSubClass>,
        javax.json.bind.serializer.JsonbDeserializer<SampleSubClass> {

    @Override
    public void serialize(SampleSubClass obj, JsonGenerator generator, SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("subClassStringProp", obj.getSubClassStringProp(), generator);
        ctx.serialize("subClassIntegerProp", obj.getSubClassIntegerProp(), generator);
        generator.writeEnd();
    }

    @Override
    public SampleSubClass deserialize(
            final JsonParser parser, final DeserializationContext ctx, final Type rtType) {
        final JsonObject jsonObject = ctx.deserialize(JsonObject.class, parser);
        return SampleSubClass.builder()
                .subClassStringProp(jsonObject.getString("subClassStringProp"))
                .subClassIntegerProp(jsonObject.getJsonNumber("subClassIntegerProp").intValue())
                .build();
    }
}
