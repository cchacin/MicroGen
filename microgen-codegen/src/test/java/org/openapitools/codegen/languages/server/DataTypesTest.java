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

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openapitools.codegen.languages.ModelTest;

import java.util.stream.Stream;

import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.BinarySchema;
import io.swagger.v3.oas.models.media.BooleanSchema;
import io.swagger.v3.oas.models.media.ByteArraySchema;
import io.swagger.v3.oas.models.media.ComposedSchema;
import io.swagger.v3.oas.models.media.DateSchema;
import io.swagger.v3.oas.models.media.DateTimeSchema;
import io.swagger.v3.oas.models.media.EmailSchema;
import io.swagger.v3.oas.models.media.FileSchema;
import io.swagger.v3.oas.models.media.IntegerSchema;
import io.swagger.v3.oas.models.media.MapSchema;
import io.swagger.v3.oas.models.media.NumberSchema;
import io.swagger.v3.oas.models.media.ObjectSchema;
import io.swagger.v3.oas.models.media.PasswordSchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.media.UUIDSchema;

import static org.junit.jupiter.params.provider.Arguments.of;
import static org.openapitools.codegen.languages.ModelTest.Optionality.NON_REQUIRED;
import static org.openapitools.codegen.languages.ModelTest.Optionality.REQUIRED;

class DataTypesTest implements ModelTest, WithAssertions {

    static Stream<Arguments> arguments() {
        return Stream.of(
                of(NON_REQUIRED, new NumberSchema(), "java.util.Optional<java.math.BigDecimal>"),
                of(REQUIRED, new NumberSchema(), "java.math.BigDecimal"),
                of(NON_REQUIRED, new IntegerSchema(), "java.util.OptionalInt"),
                of(REQUIRED, new IntegerSchema(), "Integer"),
                of(NON_REQUIRED, new IntegerSchema().format("int64"), "java.util.OptionalLong"),
                of(REQUIRED, new IntegerSchema().format("int64"), "Long"),
                of(NON_REQUIRED, new EmailSchema(), "java.util.Optional<String>"),
                of(REQUIRED, new EmailSchema(), "String"),
                of(NON_REQUIRED, new PasswordSchema(), "java.util.Optional<String>"),
                of(REQUIRED, new PasswordSchema(), "String"),
                of(NON_REQUIRED, new FileSchema(), "java.util.Optional<java.io.File>"),
                of(REQUIRED, new FileSchema(), "java.io.File"),
                of(NON_REQUIRED, new StringSchema(), "java.util.Optional<String>"),
                of(REQUIRED, new StringSchema(), "String"),
                of(NON_REQUIRED, new UUIDSchema(), "java.util.Optional<java.util.UUID>"),
                of(REQUIRED, new UUIDSchema(), "java.util.UUID"),
                of(NON_REQUIRED, new DateSchema(), "java.util.Optional<java.time.LocalDate>"),
                of(REQUIRED, new DateSchema(), "java.time.LocalDate"),
                of(NON_REQUIRED, new DateTimeSchema(), "java.util.Optional<java.time.OffsetDateTime>"),
                of(REQUIRED, new DateTimeSchema(), "java.time.OffsetDateTime"),
                of(NON_REQUIRED, new ArraySchema(), "java.util.Optional<java.util.List<String>>"),
                of(REQUIRED, new ArraySchema(), "java.util.List<String>"),
                of(NON_REQUIRED, new MapSchema(), "java.util.Optional<java.util.Map<String, String>>"),
                of(REQUIRED, new MapSchema(), "java.util.Map<String, String>"),
                of(NON_REQUIRED, new ObjectSchema(), "java.util.Optional<Object>"),
                of(REQUIRED, new ObjectSchema(), "Object"),
                of(NON_REQUIRED, new BooleanSchema(), "java.util.Optional<Boolean>"),
                of(REQUIRED, new BooleanSchema(), "Boolean"),
                of(NON_REQUIRED, new BinarySchema(), "java.util.Optional<java.io.File>"),
                of(REQUIRED, new BinarySchema(), "java.io.File"),
                of(NON_REQUIRED, new ByteArraySchema(), "java.util.Optional<byte[]>"),
                of(REQUIRED, new ByteArraySchema(), "byte[]"),
                of(NON_REQUIRED, new ComposedSchema(), "java.util.Optional<Object>"),
                of(REQUIRED, new ComposedSchema(), "Object")
        );
    }

    @ParameterizedTest(name = "{0} {2}")
    @MethodSource("arguments")
    void test(final Optionality optionality,
              final Schema fieldSchema,
              final String dataType) {
        assertThat(getDataTypeWithEnumsFor(fieldSchema, optionality))
                .containsExactlyInAnyOrder(dataType);
    }
}
