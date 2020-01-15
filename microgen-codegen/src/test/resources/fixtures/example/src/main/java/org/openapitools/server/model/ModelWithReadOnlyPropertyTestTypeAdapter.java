package org.openapitools.server.model;

public class ModelWithReadOnlyPropertyTestTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<
    ModelWithReadOnlyPropertyTest, ImmutableModelWithReadOnlyPropertyTest> {

    @Override
    public ImmutableModelWithReadOnlyPropertyTest adaptToJson(ModelWithReadOnlyPropertyTest obj)
        throws Exception {
        return ImmutableModelWithReadOnlyPropertyTest.copyOf(obj);
    }

    @Override
    public ModelWithReadOnlyPropertyTest adaptFromJson(ImmutableModelWithReadOnlyPropertyTest obj)
        throws Exception {
        return obj;
    }
}
