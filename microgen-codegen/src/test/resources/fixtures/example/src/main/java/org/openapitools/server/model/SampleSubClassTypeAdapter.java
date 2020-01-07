package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class SampleSubClassTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<SampleSubClass, ImmutableSampleSubClass> {

    @Override
    public ImmutableSampleSubClass adaptToJson(SampleSubClass obj) throws Exception {
        return ImmutableSampleSubClass.copyOf(obj);
    }

    @Override
    public SampleSubClass adaptFromJson(ImmutableSampleSubClass obj) throws Exception {
        return obj;
    }
}
