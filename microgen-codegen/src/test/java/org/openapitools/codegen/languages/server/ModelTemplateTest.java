package org.openapitools.codegen.languages.server;

import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openapitools.codegen.languages.TemplateType;

import java.nio.file.Path;
import java.util.stream.Stream;

class ModelTemplateTest implements ServerTemplateTest {

    @TempDir
    Path tmpFolder;

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("petstore", "Pet.java"),
                Arguments.of("petstore", "User.java"),
                Arguments.of("petstore", "Category.java"),
                Arguments.of("petstore", "Order.java"),
                Arguments.of("petstore", "Tag.java"),
                Arguments.of("example", "SampleBase.java"),
                Arguments.of("example", "SampleSubClass.java"),
                Arguments.of("example", "PersonCard.java"),
                Arguments.of("example", "BaseCard.java"),
                Arguments.of("example", "ModelWithPropertiesAndAdditionalProperties.java"),
                Arguments.of("example", "ModelWithMapProperties.java"),
                Arguments.of("example", "ModelWithReadOnlyPropertyTest.java")
        );
    }

    @ParameterizedTest(name = "Generated {1} should be equals to fixtures/model/{1}")
    @MethodSource("arguments")
    void test(final String openAPIFile,
              final String expectedFile) {
        this.executeTest(openAPIFile, expectedFile, this.tmpFolder);

    }

    @Override
    public TemplateType templateToTest() {
        return TemplateType.SERVER_MODEL;
    }
}
