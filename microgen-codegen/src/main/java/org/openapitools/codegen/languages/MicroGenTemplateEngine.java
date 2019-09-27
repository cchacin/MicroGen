package org.openapitools.codegen.languages;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import com.google.googlejavaformat.java.JavaFormatterOptions;

import org.openapitools.codegen.api.TemplatingGenerator;
import org.openapitools.codegen.templating.MustacheEngineAdapter;

import java.io.IOException;
import java.util.Map;

public class MicroGenTemplateEngine extends MustacheEngineAdapter {

    private final Formatter formatter =
            new Formatter(JavaFormatterOptions.builder()
                                              .style(JavaFormatterOptions.Style.GOOGLE)
                                              .build());

    @Override
    public String getIdentifier() {
        return "microgen";
    }
    
    @Override
    public String compileTemplate(TemplatingGenerator generator,
                                  Map<String, Object> bundle,
                                  String templateFile) throws IOException {
        final String rendered = super.compileTemplate(generator, bundle, templateFile);
        try {
            if (rendered.startsWith("package ")) {
                return formatter.formatSourceAndFixImports(rendered);
            }
        } catch (FormatterException e) {
            return rendered;
//            throw new IOException("Final result was not a proper Java file", e);
        }
        return rendered;
    }
}
