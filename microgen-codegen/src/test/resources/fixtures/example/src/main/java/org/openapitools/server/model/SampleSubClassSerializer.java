package org.openapitools.server.model;

public class SampleSubClassSerializer
        implements javax.json.bind.serializer.JsonbSerializer<SampleSubClass>,
        javax.json.bind.serializer.JsonbDeserializer<SampleSubClass> {

    @Override
    public void serialize(
            SampleSubClass obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.writeStartObject();
        ctx.serialize("baseClassStringProp", obj.getBaseClassStringProp(), generator);
        ctx.serialize("baseClassIntegerProp", obj.getBaseClassIntegerProp(), generator);
        ctx.serialize("subClassStringProp", obj.getSubClassStringProp(), generator);
        ctx.serialize("subClassIntegerProp", obj.getSubClassIntegerProp(), generator);
        generator.writeEnd();
    }

    @Override
    public SampleSubClass deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static SampleSubClass fromJsonObject(final javax.json.JsonObject jsonObject) {
        return SampleSubClass.builder()
                .baseClassStringProp(jsonObject.getString("baseClassStringProp"))
                .baseClassIntegerProp(jsonObject.getJsonNumber("baseClassIntegerProp").intValue())
                .subClassStringProp(jsonObject.getString("subClassStringProp"))
                .subClassIntegerProp(jsonObject.getJsonNumber("subClassIntegerProp").intValue())
                .build();
    }

    public static java.util.List<SampleSubClass> fromJsonArray(final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
