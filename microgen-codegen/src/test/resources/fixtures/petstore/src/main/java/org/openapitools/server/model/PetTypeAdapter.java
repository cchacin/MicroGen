package org.openapitools.server.model;

@javax.ws.rs.ext.Provider
public class PetTypeAdapter
    implements javax.json.bind.adapter.JsonbAdapter<Pet, ImmutablePet> {

    @Override
    public ImmutablePet adaptToJson(Pet obj) throws Exception {
        return ImmutablePet.copyOf(obj);
    }

    @Override
    public Pet adaptFromJson(ImmutablePet obj) throws Exception {
        return obj;
    }
}
