package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class ModelWithMapPropertiesTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<
    ModelWithMapProperties, ImmutableModelWithMapProperties> {

    @Override
    public ImmutableModelWithMapProperties adaptToJson(ModelWithMapProperties obj) throws Exception {
        return ImmutableModelWithMapProperties.copyOf(obj);
    }

    @Override
    public ModelWithMapProperties adaptFromJson(ImmutableModelWithMapProperties obj)
        throws Exception {
        return obj;
    }
}
