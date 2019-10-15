package org.openapitools.codegen.languages.server;

import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openapitools.codegen.languages.TemplateType;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class ApiTestExampleTemplateTest implements ServerTemplateTest {

    @TempDir
    Path tmpFolder;

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("example", "ModelsGroupRestClientExamples.json"),
                Arguments.of("example", "ParametersGroupRestClientExamples.json"),
                Arguments.of("petstore", "PetRestClientExamples.json"),
                Arguments.of("petstore", "StoreRestClientExamples.json"),
                Arguments.of("petstore", "DefaultRestClientExamples.json"),
                Arguments.of("petstore", "UserRestClientExamples.json")
        );
    }

    @ParameterizedTest(name = "Generated {1} should be equals to fixtures/server/test/examples/{1}")
    @MethodSource("arguments")
    void test(final String openAPIFile,
              final String expectedFile) {
        this.executeTest(openAPIFile, expectedFile, Paths.get("target"));
    }

    @Override
    public TemplateType templateToTest() {
        return TemplateType.SERVER_EXAMPLE_TEST;
    }

    @Override
    public String formatted(final String text) {
        return text;
    }
}
