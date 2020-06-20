/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.openapitools.codegen.languages.server;

import io.swagger.v3.oas.models.media.*;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openapitools.codegen.languages.MicroGenProperty;
import org.openapitools.codegen.languages.ModelTest;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;
import static org.openapitools.codegen.languages.ModelTest.Optionality.NON_REQUIRED;
import static org.openapitools.codegen.languages.ModelTest.Optionality.REQUIRED;

class DeserializerTypeTest implements ModelTest, WithAssertions {

    static Stream<Arguments> arguments() {
        return Stream
                .of(of(NON_REQUIRED, new NumberSchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(REQUIRED, new NumberSchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(NON_REQUIRED, new IntegerSchema(), ".myschema(jsonObject.getJsonNumber(\"myschema\").intValue())"),
                        of(REQUIRED, new IntegerSchema(), ".myschema(jsonObject.getJsonNumber(\"myschema\").intValue())"),
                        of(NON_REQUIRED, new IntegerSchema().format("int64"), ".myschema(jsonObject.getJsonNumber(\"myschema\").longValue())"),
                        of(REQUIRED, new IntegerSchema().format("int64"), ".myschema(jsonObject.getJsonNumber(\"myschema\").longValue())"),
                        of(NON_REQUIRED, new EmailSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(REQUIRED, new EmailSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(NON_REQUIRED, new PasswordSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(REQUIRED, new PasswordSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(NON_REQUIRED, new FileSchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(REQUIRED, new FileSchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(NON_REQUIRED, new StringSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(REQUIRED, new StringSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(NON_REQUIRED, new UUIDSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(REQUIRED, new UUIDSchema(), ".myschema(jsonObject.getString(\"myschema\"))"),
                        of(NON_REQUIRED, new DateSchema(), ".myschema(java.time.LocalDate.parse(jsonObject.getString(\"myschema\")))"),
                        of(REQUIRED, new DateSchema(), ".myschema(java.time.LocalDate.parse(jsonObject.getString(\"myschema\")))"),
                        of(NON_REQUIRED, new DateTimeSchema(), ".myschema(java.time.OffsetDateTime.parse(jsonObject.getString(\"myschema\")))"),
                        of(REQUIRED, new DateTimeSchema(), ".myschema(java.time.OffsetDateTime.parse(jsonObject.getString(\"myschema\")))"),
                        of(NON_REQUIRED, new ArraySchema(), ".addAllMyschema(jsonObject.getJsonArray(\"myschema\").getValuesAs(JsonString::getString))"),
                        of(REQUIRED, new ArraySchema(), ".addAllMyschema(jsonObject.getJsonArray(\"myschema\").getValuesAs(JsonString::getString))"),
                        of(NON_REQUIRED, new MapSchema(), ".putAllMyschema(jsonObject.getJsonObject(\"myschema\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))"),
                        of(REQUIRED, new MapSchema(), ".putAllMyschema(jsonObject.getJsonObject(\"myschema\").entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().toString())))"),
                        of(NON_REQUIRED, new ObjectSchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(REQUIRED, new ObjectSchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(NON_REQUIRED, new BooleanSchema(), ".myschema(jsonObject.getBoolean(\"myschema\"))"),
                        of(REQUIRED, new BooleanSchema(), ".myschema(jsonObject.getBoolean(\"myschema\"))"),
                        of(NON_REQUIRED, new BinarySchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(REQUIRED, new BinarySchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(NON_REQUIRED, new ByteArraySchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"), // TODO fix optional byte[]
                        of(REQUIRED, new ByteArraySchema(), ".myschema(jsonObject.getJsonObject(\"myschema\"))"),
                        of(NON_REQUIRED, new ComposedSchema(), ".myschema(ObjectSerializer.fromJsonObject(jsonObject))"),
                        of(REQUIRED, new ComposedSchema(), ".myschema(ObjectSerializer.fromJsonObject(jsonObject))"));
    }

    @ParameterizedTest(name = "{0} {1}")
    @MethodSource("arguments")
    void test(
            final Optionality optionality, final Schema fieldSchema, final String dataType) {
        assertThat(extractProperty(fieldSchema, optionality, MicroGenProperty::deserializer))
                .containsExactlyInAnyOrder(dataType);
    }
}
