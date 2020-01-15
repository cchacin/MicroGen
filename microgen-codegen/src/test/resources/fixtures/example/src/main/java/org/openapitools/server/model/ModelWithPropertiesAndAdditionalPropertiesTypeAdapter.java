package org.openapitools.server.model;

public class ModelWithPropertiesAndAdditionalPropertiesTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<
    ModelWithPropertiesAndAdditionalProperties,
    ImmutableModelWithPropertiesAndAdditionalProperties> {

    @Override
    public ImmutableModelWithPropertiesAndAdditionalProperties adaptToJson(
        ModelWithPropertiesAndAdditionalProperties obj) throws Exception {
        return ImmutableModelWithPropertiesAndAdditionalProperties.copyOf(obj);
    }

    @Override
    public ModelWithPropertiesAndAdditionalProperties adaptFromJson(
        ImmutableModelWithPropertiesAndAdditionalProperties obj) throws Exception {
        return obj;
    }
}
