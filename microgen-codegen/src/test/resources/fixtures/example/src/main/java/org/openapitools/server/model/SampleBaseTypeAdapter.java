package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class SampleBaseTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<SampleBase, ImmutableSampleBase> {

    @Override
    public ImmutableSampleBase adaptToJson(SampleBase obj) throws Exception {
        return ImmutableSampleBase.copyOf(obj);
    }

    @Override
    public SampleBase adaptFromJson(ImmutableSampleBase obj) throws Exception {
        return obj;
    }
}
