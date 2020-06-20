package org.openapitools.server.model;

public class ModelWithMapPropertiesSerializer
        implements javax.json.bind.serializer.JsonbSerializer<ModelWithMapProperties>,
        javax.json.bind.serializer.JsonbDeserializer<ModelWithMapProperties> {

    @Override
    public void serialize(
            ModelWithMapProperties obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {

        generator.writeStartObject();
        ctx.serialize("stringMap", obj.getStringMap(), generator);
        ctx.serialize("integerMap", obj.getIntegerMap(), generator);
        ctx.serialize("errorInfoMap", obj.getErrorInfoMap(), generator);
        ctx.serialize("errorInfoArrayMap", obj.getErrorInfoArrayMap(), generator);
        generator.writeEnd();
    }

    @Override
    public ModelWithMapProperties deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {

        return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
    }

    public static ModelWithMapProperties fromJsonObject(final javax.json.JsonObject jsonObject) {
        return ModelWithMapProperties.builder()
                .putAllStringMap(
                        jsonObject.getJsonObject("stringMap").entrySet().stream()
                                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))
                .putAllIntegerMap(
                        jsonObject.getJsonObject("integerMap").entrySet().stream()
                                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))
                .putAllErrorInfoMap(
                        jsonObject.getJsonObject("errorInfoMap").entrySet().stream()
                                .collect(
                                        Collectors.toMap(
                                                Map.Entry::getKey,
                                                entry ->
                                                        ErrorInfo.ErrorInfoSerializer.fromJsonObject(
                                                                entry.getValue().asJsonObject()))))
                .errorInfoArrayMap(jsonObject.getJsonObject("errorInfoArrayMap")) // TODO
                .build();
    }

    public static java.util.List<ModelWithMapProperties> fromJsonArray(
            final javax.json.JsonArray jsonArray) {
        return jsonArray.stream()
                .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
                .collect(java.util.stream.Collectors.toList());
    }
}
