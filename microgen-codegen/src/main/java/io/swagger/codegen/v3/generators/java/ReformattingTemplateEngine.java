package io.swagger.codegen.v3.generators.java;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import com.google.googlejavaformat.java.JavaFormatterOptions;

import java.io.IOException;
import java.util.Map;

import io.swagger.codegen.v3.templates.TemplateEngine;

public final class ReformattingTemplateEngine implements TemplateEngine {
  private final Formatter formatter = new Formatter(JavaFormatterOptions.builder()
                                                                        .style(JavaFormatterOptions.Style.GOOGLE)
                                                                        .build());

  private final TemplateEngine templateEngine;

  public ReformattingTemplateEngine(final TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  @Override
  public String getRendered(final String templateFile, final Map<String, Object> templateData) throws IOException {
    try {
      String rendered = templateEngine.getRendered(templateFile, templateData);
      if (rendered.startsWith("package ")) {
        rendered = formatter.formatSourceAndFixImports(rendered);
      }
      return rendered;
    } catch (FormatterException e) {
      throw new IOException("Final result was not a proper Java file", e);
    }
  }

  @Override
  public String getName() {
    return "java-formatted-" + templateEngine.getName();
  }
}
