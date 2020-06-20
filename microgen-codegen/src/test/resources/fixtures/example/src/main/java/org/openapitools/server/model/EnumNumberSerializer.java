package org.openapitools.server.model;

public class EnumNumberSerializer
        implements javax.json.bind.serializer.JsonbSerializer<EnumNumber>,
        javax.json.bind.serializer.JsonbDeserializer<EnumNumber> {

    @Override
    public void serialize(
            EnumNumber obj,
            javax.json.stream.JsonGenerator generator,
            javax.json.bind.serializer.SerializationContext ctx) {
        generator.write(obj.getValue());
    }

    @Override
    public EnumNumber deserialize(
            final javax.json.stream.JsonParser parser,
            final javax.json.bind.serializer.DeserializationContext ctx,
            final java.lang.reflect.Type rtType) {
        return EnumNumber.fromValue(parser.getString());
    }
}
