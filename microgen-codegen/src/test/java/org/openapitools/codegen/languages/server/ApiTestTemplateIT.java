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
