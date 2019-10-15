package org.openapitools.codegen.languages;

import java.util.HashMap;
import java.util.Map;

interface Builder {
    String JAVA_UTIL_LIST = "java.util.List";
    String JAVA_UTIL_MAP = "java.util.Map";
    String JAVA_UTIL_HASHMAP = "java.util.HashMap";

    static Map<String, String> buildTypeMapping() {
        final HashMap<String, String> typeMapping = new HashMap<>();
        typeMapping.put("array", Builder.JAVA_UTIL_LIST);
        typeMapping.put("map", Builder.JAVA_UTIL_MAP);
        typeMapping.put("List", Builder.JAVA_UTIL_LIST);
        typeMapping.put("boolean", "Boolean");
        typeMapping.put("string", "String");
        typeMapping.put("int", "Integer");
        typeMapping.put("float", "Float");
        typeMapping.put("number", "java.math.BigDecimal");
        typeMapping.put("DateTime", "java.time.OffsetDateTime");
        typeMapping.put("date", "java.time.LocalDate");
        typeMapping.put("long", "Long");
        typeMapping.put("short", "Short");
        typeMapping.put("char", "String");
        typeMapping.put("double", "Double");
        typeMapping.put("object", "Object");
        typeMapping.put("integer", "Integer");
        typeMapping.put("ByteArray", "byte[]");
        typeMapping.put("binary", "byte[]");
        typeMapping.put("file", "java.io.File");
        typeMapping.put("UUID", "java.util.UUID");
        typeMapping.put("BigDecimal", "java.math.BigDecimal");
        return typeMapping;
    }
}
