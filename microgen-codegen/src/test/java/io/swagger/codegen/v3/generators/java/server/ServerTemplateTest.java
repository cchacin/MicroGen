package io.swagger.codegen.v3.generators.java.server;

import io.swagger.codegen.v3.CodegenConfig;
import io.swagger.codegen.v3.generators.java.MicroGen;
import io.swagger.codegen.v3.generators.java.TemplateTest;

import java.nio.file.Path;

public interface ServerTemplateTest extends TemplateTest {

    @Override
    default CodegenConfig codegen(final Path tempDirectory) {
        final MicroGen codegen = new MicroGen();
        codegen.setLibrary("server");
        codegen.setModelPackage("io.swagger.server.model");
        codegen.setApiPackage("io.swagger.server.api");
        codegen.setOutputDir(tempDirectory.toString());
        return codegen;
    }

    default void executeTest(final String swaggerFile,
                             final String expectedFile,
                             final Path tmpFolder,
                             final boolean formatted) {
        this.executeTest(swaggerFile, swaggerFile, expectedFile, tmpFolder, formatted);
    }

    default void executeTest(final String swaggerFile,
                             final String expectedFile,
                             final Path tmpFolder) {
        this.executeTest(swaggerFile, expectedFile, tmpFolder, true);
    }
}
