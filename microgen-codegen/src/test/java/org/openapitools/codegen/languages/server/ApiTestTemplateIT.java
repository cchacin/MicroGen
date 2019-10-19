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

import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openapitools.codegen.languages.TemplateType;

import java.nio.file.Path;
import java.util.stream.Stream;

class ApiTestTemplateIT implements ServerTemplateTest {

    @TempDir
    Path tmpFolder;

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("example", "ModelsGroupRestClient.java"),
                Arguments.of("example", "ParametersGroupRestClient.java"),
                Arguments.of("petstore", "PetRestClient.java"),
                Arguments.of("petstore", "StoreRestClient.java"),
                Arguments.of("petstore", "DefaultRestClient.java"),
                Arguments.of("petstore", "UserRestClient.java")
        );
    }

    @ParameterizedTest(name = "Generated {1} should be equals to fixtures/server/api/{1}")
    @MethodSource("arguments")
    void test(final String openAPIFile,
              final String expectedFile) {
        this.executeTest(openAPIFile, expectedFile, this.tmpFolder);
    }

    @Override
    public TemplateType templateToTest() {
        return TemplateType.SERVER_API_TEST;
    }
}
