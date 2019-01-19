package io.swagger.codegen.v3.generators.java;

import com.google.common.io.Resources;
import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

import org.assertj.core.api.Assertions;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import io.swagger.codegen.v3.ClientOptInput;
import io.swagger.codegen.v3.ClientOpts;
import io.swagger.codegen.v3.CodegenConfig;
import io.swagger.codegen.v3.DefaultGenerator;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;

public interface TemplateTest {

    TemplateType templateToTest();

    default String fileContent(final String fileName) {
        try {
            return Resources.toString(Resources.getResource(fileName),
                                      Charset.defaultCharset());
        }
        catch (final Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    default String fileContent(final Path path) {
        try {
            return Resources.toString(path.toUri().toURL(),
                                      Charset.defaultCharset());
        }
        catch (final Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    default String fileContentFormatted(final String fileName) {
        return this.formatted(this.fileContent(fileName));
    }

    default String fileContentFormatted(final Path path) {
        return this.formatted(this.fileContent(path));
    }

    default String formatted(final String text) {
        try {
            return this.formatter().formatSource(text);
        }
        catch (final FormatterException exception) {
            throw new RuntimeException(exception);
        }
    }

    default Formatter formatter() {
        return new Formatter();
    }

    default List<File> generate(final String swaggerFile, final Path tempDirectory) {
        return new DefaultGenerator()
                .opts(new ClientOptInput()
                              .opts(new ClientOpts())
                              .config(this.codegen(tempDirectory))
                              .openAPI(new OpenAPIV3Parser().readContents(this.fileContent(swaggerFile),
                                                                          Collections.emptyList(),
                                                                          new ParseOptions()).getOpenAPI()))
                .generate();
    }

    default void executeTest(final String swaggerFile,
                             final String expectedFileFixture,
                             final String expectedFile,
                             final Path tmpFolder,
                             final boolean formatted) {
        // When
        this.generate(String.format("3_0/%s.yml", swaggerFile), tmpFolder);

        final Function<Path, String> generatedFile = formatted ? this::fileContentFormatted : this::fileContent;
        final Function<String, String> fixtureFile = formatted ? this::fileContentFormatted : this::fileContent;

        // Then
        final String generated = generatedFile.apply(tmpFolder.resolve(this.templateToTest()
                                                                           .getFolder() + expectedFile));
        final String fixture = fixtureFile.apply(String.format("fixtures/%s/%s/%s",
                                                               expectedFileFixture,
                                                               this.templateToTest().getFolder(),
                                                               expectedFile));
        Assertions.assertThat(generated)
                  .isEqualTo(fixture);
    }

    CodegenConfig codegen(final Path tempDirectory);
}
