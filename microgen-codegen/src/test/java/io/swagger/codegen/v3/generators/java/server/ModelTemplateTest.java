package io.swagger.codegen.v3.generators.java.server;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.rules.TemporaryFolder;

import java.util.stream.Stream;

import io.swagger.codegen.v3.generators.java.TemplateType;

@EnableRuleMigrationSupport
class ModelTemplateTest extends Assertions implements ServerTemplateTest {

    @Rule
    public final TemporaryFolder tmpFolder = new TemporaryFolder();

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
                Arguments.of("example", "ModelWithStringAdditionalProperties.java"),
                Arguments.of("example", "ModelWithIntegerAdditionalProperties.java"),
                Arguments.of("example", "ModelWithComplexAdditionalProperties.java"),
                Arguments.of("example", "ModelWithMapProperties.java"),
                Arguments.of("example", "ModelWithReadOnlyPropertyTest.java")
        );
    }

    @ParameterizedTest(name = "Generated {1} should be equals to fixtures/model/{1}")
    @MethodSource("arguments")
    void test(final String swaggerFile,
              final String expectedFile) {
        this.executeTest(swaggerFile, expectedFile, this.tmpFolder.getRoot().toPath().toAbsolutePath());

    }

    @Override
    public TemplateType templateToTest() {
        return TemplateType.SERVER_MODEL;
    }
}
