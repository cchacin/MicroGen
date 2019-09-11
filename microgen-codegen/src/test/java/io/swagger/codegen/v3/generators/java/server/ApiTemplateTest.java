package io.swagger.codegen.v3.generators.java.server;

import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.Path;
import java.util.stream.Stream;

import io.swagger.codegen.v3.generators.java.TemplateType;

class ApiTemplateTest implements ServerTemplateTest {

    @TempDir
    Path tmpFolder;

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("example", "ModelsGroupApi.java"),
                Arguments.of("example", "ParametersGroupApi.java"),
                Arguments.of("petstore", "PetApi.java"),
                Arguments.of("petstore", "StoreApi.java"),
                Arguments.of("petstore", "DefaultApi.java"),
                Arguments.of("petstore", "UserApi.java")
        );
    }

    @ParameterizedTest(name = "Generated {1} should be equals to fixtures/server/api/{1}")
    @MethodSource("arguments")
    void test(final String swaggerFile,
              final String expectedFile) {
        this.executeTest(swaggerFile, expectedFile, this.tmpFolder);
    }

    @Override
    public TemplateType templateToTest() {
        return TemplateType.SERVER_API;
    }
}
