package org.openapitools.codegen.languages.server;

import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openapitools.codegen.languages.TemplateType;

import java.nio.file.Path;
import java.util.stream.Stream;

class ApiTestTemplateTest implements ServerTemplateTest {

    @TempDir
    Path tmpFolder;

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("example", "ModelsGroupApiClient.java"),
                Arguments.of("example", "ParametersGroupApiClient.java")
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
