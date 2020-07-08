package org.openapitools.server.model;

public class AllPrimitivesSerializer
    implements javax.json.bind.serializer.JsonbSerializer<AllPrimitives>,
        javax.json.bind.serializer.JsonbDeserializer<AllPrimitives> {

  @Override
  public void serialize(
      AllPrimitives obj,
      javax.json.stream.JsonGenerator generator,
      javax.json.bind.serializer.SerializationContext ctx) {

    generator.writeStartObject();
    ctx.serialize("myIntOptional", obj.getMyIntOptional(), generator);
    ctx.serialize("myIntRequired", obj.getMyIntRequired(), generator);
    ctx.serialize("myInt64Optional", obj.getMyInt64Optional(), generator);
    ctx.serialize("myInt64Required", obj.getMyInt64Required(), generator);
    ctx.serialize("myFloatOptional", obj.getMyFloatOptional(), generator);
    ctx.serialize("myFloatRequired", obj.getMyFloatRequired(), generator);
    ctx.serialize("myDoubleOptional", obj.getMyDoubleOptional(), generator);
    ctx.serialize("myDoubleRequired", obj.getMyDoubleRequired(), generator);
    ctx.serialize("myStringOptional", obj.getMyStringOptional(), generator);
    ctx.serialize("myStringRequired", obj.getMyStringRequired(), generator);
    ctx.serialize("myBytesOptional", obj.getMyBytesOptional(), generator);
    ctx.serialize("myBytesRequired", obj.getMyBytesRequired(), generator);
    ctx.serialize("myBinaryOptional", obj.getMyBinaryOptional(), generator);
    ctx.serialize("myBinaryRequired", obj.getMyBinaryRequired(), generator);
    ctx.serialize("myBooleanOptional", obj.getMyBooleanOptional(), generator);
    ctx.serialize("myBooleanRequired", obj.getMyBooleanRequired(), generator);
    ctx.serialize("myDateOptional", obj.getMyDateOptional(), generator);
    ctx.serialize("myDateRequired", obj.getMyDateRequired(), generator);
    ctx.serialize("myDateTimeOptional", obj.getMyDateTimeOptional(), generator);
    ctx.serialize("myDateTimeRequired", obj.getMyDateTimeRequired(), generator);
    ctx.serialize("myFileOptional", obj.getMyFileOptional(), generator);
    ctx.serialize("myFileRequired", obj.getMyFileRequired(), generator);
    ctx.serialize("myUUIDOptional", obj.getMyUUIDOptional(), generator);
    ctx.serialize("myUUIDRequired", obj.getMyUUIDRequired(), generator);
    ctx.serialize("myEnumStringOptional", obj.getMyEnumStringOptional(), generator);
    ctx.serialize("myEnumStringRequired", obj.getMyEnumStringRequired(), generator);
    ctx.serialize("myEnumIntegerOptional", obj.getMyEnumIntegerOptional(), generator);
    ctx.serialize("myEnumIntegerRequired", obj.getMyEnumIntegerRequired(), generator);
    ctx.serialize("myEnumNumberOptional", obj.getMyEnumNumberOptional(), generator);
    ctx.serialize("myEnumNumberRequired", obj.getMyEnumNumberRequired(), generator);
    ctx.serialize("myInlineEnumStringOptional", obj.getMyInlineEnumStringOptional(), generator);
    ctx.serialize("myInlineEnumStringRequired", obj.getMyInlineEnumStringRequired(), generator);
    ctx.serialize("myInlineEnumIntegerOptional", obj.getMyInlineEnumIntegerOptional(), generator);
    ctx.serialize("myInlineEnumIntegerRequired", obj.getMyInlineEnumIntegerRequired(), generator);
    ctx.serialize("myInlineEnumNumberOptional", obj.getMyInlineEnumNumberOptional(), generator);
    ctx.serialize("myInlineEnumNumberRequired", obj.getMyInlineEnumNumberRequired(), generator);
    ctx.serialize("allowEmptyValueTrue", obj.getAllowEmptyValueTrue(), generator);
    generator.writeEnd();
  }

  @Override
  public AllPrimitives deserialize(
      final javax.json.stream.JsonParser parser,
      final javax.json.bind.serializer.DeserializationContext ctx,
      final java.lang.reflect.Type rtType) {

    return fromJsonObject(ctx.deserialize(javax.json.JsonObject.class, parser));
  }

  public static AllPrimitives fromJsonObject(final javax.json.JsonObject jsonObject) {
    return AllPrimitives.builder()
        .myIntOptional(jsonObject.getJsonNumber("myIntOptional").intValue())
        .myIntRequired(jsonObject.getJsonNumber("myIntRequired").intValue())
        .myInt64Optional(jsonObject.getJsonNumber("myInt64Optional").longValue())
        .myInt64Required(jsonObject.getJsonNumber("myInt64Required").longValue())
        .myFloatOptional(jsonObject.getJsonNumber("myFloatOptional").doubleValue())
        .myFloatRequired(jsonObject.getJsonNumber("myFloatRequired").doubleValue())
        .myDoubleOptional(jsonObject.getJsonNumber("myDoubleOptional").doubleValue())
        .myDoubleRequired(jsonObject.getJsonNumber("myDoubleRequired").doubleValue())
        .myStringOptional(jsonObject.getString("myStringOptional"))
        .myStringRequired(jsonObject.getString("myStringRequired"))
        .myBytesOptional(jsonObject.getJsonObject("myBytesOptional")) // TODO
        .myBytesRequired(jsonObject.getJsonObject("myBytesRequired")) // TODO
        .myBinaryOptional(jsonObject.getJsonObject("myBinaryOptional")) // TODO
        .myBinaryRequired(jsonObject.getJsonObject("myBinaryRequired")) // TODO
        .myBooleanOptional(jsonObject.getBoolean("myBooleanOptional"))
        .myBooleanRequired(jsonObject.getBoolean("myBooleanRequired"))
        .myDateOptional(java.time.LocalDate.parse(jsonObject.getString("myDateOptional")))
        .myDateRequired(java.time.LocalDate.parse(jsonObject.getString("myDateRequired")))
        .myDateTimeOptional(
            java.time.OffsetDateTime.parse(jsonObject.getString("myDateTimeOptional")))
        .myDateTimeRequired(
            java.time.OffsetDateTime.parse(jsonObject.getString("myDateTimeRequired")))
        .myFileOptional(jsonObject.getJsonObject("myFileOptional")) // TODO
        .myFileRequired(jsonObject.getJsonObject("myFileRequired")) // TODO
        .myUUIDOptional(jsonObject.getString("myUUIDOptional"))
        .myUUIDRequired(jsonObject.getString("myUUIDRequired"))
        .myEnumStringOptional(EnumString.fromValue(jsonObject.getString("myEnumStringOptional")))
        .myEnumStringRequired(EnumString.fromValue(jsonObject.getString("myEnumStringRequired")))
        .myEnumIntegerOptional(EnumInteger.fromValue(jsonObject.getString("myEnumIntegerOptional")))
        .myEnumIntegerRequired(EnumInteger.fromValue(jsonObject.getString("myEnumIntegerRequired")))
        .myEnumNumberOptional(EnumNumber.fromValue(jsonObject.getString("myEnumNumberOptional")))
        .myEnumNumberRequired(EnumNumber.fromValue(jsonObject.getString("myEnumNumberRequired")))
        .myInlineEnumStringOptional(
            MyInlineEnumStringOptionalEnum.fromValue(
                jsonObject.getString("myInlineEnumStringOptional")))
        .myInlineEnumStringRequired(
            MyInlineEnumStringRequiredEnum.fromValue(
                jsonObject.getString("myInlineEnumStringRequired")))
        .myInlineEnumIntegerOptional(
            MyInlineEnumIntegerOptionalEnum.fromValue(
                jsonObject.getString("myInlineEnumIntegerOptional")))
        .myInlineEnumIntegerRequired(
            MyInlineEnumIntegerRequiredEnum.fromValue(
                jsonObject.getString("myInlineEnumIntegerRequired")))
        .myInlineEnumNumberOptional(
            MyInlineEnumNumberOptionalEnum.fromValue(
                jsonObject.getString("myInlineEnumNumberOptional")))
        .myInlineEnumNumberRequired(
            MyInlineEnumNumberRequiredEnum.fromValue(
                jsonObject.getString("myInlineEnumNumberRequired")))
        .allowEmptyValueTrue(jsonObject.getString("allowEmptyValueTrue"))
        .build();
  }

  public static java.util.List<AllPrimitives> fromJsonArray(final javax.json.JsonArray jsonArray) {
    return jsonArray.stream()
        .map(jsonValue -> fromJsonObject(jsonValue.asJsonObject()))
        .collect(java.util.stream.Collectors.toList());
  }
}
