package org.openapitools.server.model;

/** Category */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.NONE,
        jacksonIntegration = false,
        of = "new",
        allParameters = true,
        passAnnotations = {
                javax.json.bind.annotation.JsonbAnnotation.class,
                javax.json.bind.annotation.JsonbCreator.class,
                javax.json.bind.annotation.JsonbDateFormat.class,
                javax.json.bind.annotation.JsonbNillable.class,
                javax.json.bind.annotation.JsonbNumberFormat.class,
                javax.json.bind.annotation.JsonbProperty.class,
                javax.json.bind.annotation.JsonbPropertyOrder.class,
                javax.json.bind.annotation.JsonbTransient.class,
                javax.json.bind.annotation.JsonbTypeAdapter.class,
                javax.json.bind.annotation.JsonbTypeSerializer.class,
                javax.json.bind.annotation.JsonbTypeDeserializer.class,
                javax.json.bind.annotation.JsonbVisibility.class
        },
        jdkOnly = true)
@javax.json.bind.annotation.JsonbPropertyOrder({
                                                       Category.JSONB_PROPERTY_ID,
                                                       Category.JSONB_PROPERTY_NAME
                                               })
@javax.json.bind.annotation.JsonbTypeAdapter(Category.CategoryJsonbTypeAdapter.class)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public abstract class Category {

    public static final String JSONB_PROPERTY_ID = "id";
    public static final String JSONB_PROPERTY_NAME = "name";

    @javax.json.bind.annotation.JsonbCreator
    public Category() {}

    /**
     * Get id
     *
     * @return id
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_ID)
    public abstract java.util.OptionalLong getId();

    /**
     * Get name
     *
     * @return name
     */
    @javax.json.bind.annotation.JsonbProperty(JSONB_PROPERTY_NAME)
    public abstract java.util.Optional<String> getName();

    @javax.ws.rs.ext.Provider
    public static class CategoryJsonbTypeAdapter
            implements javax.json.bind.adapter.JsonbAdapter<
            Category, CategoryInternalBuilder.ImmutableCategory> {

        @Override
        public CategoryInternalBuilder.ImmutableCategory adaptToJson(Category obj) throws Exception {
            return CategoryInternalBuilder.ImmutableCategory.copyOf(obj);
        }

        @Override
        public Category adaptFromJson(CategoryInternalBuilder.ImmutableCategory obj) throws Exception {
            return obj;
        }
    }

    public static class Builder extends CategoryInternalBuilder {}

    public static Builder builder() {
        return new Builder();
    }
}
