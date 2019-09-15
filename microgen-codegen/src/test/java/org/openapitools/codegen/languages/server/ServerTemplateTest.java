package org.openapitools.codegen.languages.server;

import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.MicroGen;
import org.openapitools.codegen.languages.TemplateTest;

import java.nio.file.Path;

public interface ServerTemplateTest extends TemplateTest {

    @Override
    default CodegenConfig codegen(final Path tempDirectory) {
        final MicroGen codegen = new MicroGen();
        codegen.setLibrary("server");
        codegen.setModelPackage("org.openapitools.server.model");
        codegen.setApiPackage("org.openapitools.server.api");
        codegen.setOutputDir(tempDirectory.toString());
        return codegen;
    }

    default void executeTest(final String openAPIFile,
                             final String expectedFile,
                             final Path tmpFolder,
                             final boolean formatted) {
        this.executeTest(openAPIFile, openAPIFile, expectedFile, tmpFolder, formatted);
    }

    default void executeTest(final String openAPIFile,
                             final String expectedFile,
                             final Path tmpFolder) {
        this.executeTest(openAPIFile, expectedFile, tmpFolder, true);
    }
}
