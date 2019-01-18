package io.swagger.codegen.v3.generators.java.server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import io.swagger.codegen.v3.CodegenModel;
import io.swagger.codegen.v3.CodegenProperty;
import io.swagger.codegen.v3.generators.java.MicroGen;
import io.swagger.v3.oas.models.media.DateSchema;
import io.swagger.v3.oas.models.media.DateTimeSchema;
import io.swagger.v3.oas.models.media.IntegerSchema;
import io.swagger.v3.oas.models.media.Schema;

class Java8ModelTest extends Assertions {

    @Test
    @DisplayName("convert a simple java model with java8 types")
    void simpleModelTest() {
        final Schema schema = new Schema()
                .name("id")
                .description("a sample model");
        final Map<String, Schema> pro = new HashMap<>();

        pro.put("id32", new IntegerSchema());
        pro.put("id64", new IntegerSchema().format("int64"));
        pro.put("theDate", new DateSchema());
        pro.put("createdAt", new DateTimeSchema());

        schema.properties(pro);


        final MicroGen codegen = new MicroGen();
        codegen.processOpts();
        codegen.setLibrary("server");
        final CodegenModel cm = codegen.fromModel("sample", schema);

        assertThat(cm.vars)
                .extracting(CodegenProperty::getDatatype)
                .containsExactlyInAnyOrder(
                        "Integer",
                        "Long",
                        "java.time.LocalDate",
                        "java.time.OffsetDateTime"
                );
    }
}
