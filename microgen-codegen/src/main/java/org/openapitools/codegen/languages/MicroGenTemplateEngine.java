package org.openapitools.codegen.languages;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import com.google.googlejavaformat.java.JavaFormatterOptions;
import org.openapitools.codegen.api.TemplatingGenerator;
import org.openapitools.codegen.templating.MustacheEngineAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

public class MicroGenTemplateEngine extends MustacheEngineAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(MicroGenTemplateEngine.class);

    private final Formatter formatter = new Formatter(
            JavaFormatterOptions.builder().style(JavaFormatterOptions.Style.GOOGLE).build());

    @Override
    public String getIdentifier() {
        return "microgen";
    }

    @Override
    public String compileTemplate(final TemplatingGenerator generator, final Map<String, Object> bundle,
                                  final String templateFile) throws IOException {
        final String rendered = super.compileTemplate(generator, bundle, templateFile);
        try {
            if (rendered.startsWith("package ")) {
                return this.formatter.formatSourceAndFixImports(rendered);
            }
        } catch (final FormatterException e) {
            LOGGER.error("Final result was not a proper Java file: {}", e.getMessage());
            e.printStackTrace();
            e.diagnostics().forEach(diagnostic -> LOGGER
                    .error("Line: {}, Column: {}", diagnostic.line(), diagnostic.column()));
            throw new IOException("Final result was not a proper Java file", e);
        }
        return rendered;
    }
}
