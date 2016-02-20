package com.wavelet.resource;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import com.wavelet.model.Health;
import com.wavelet.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/health")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class HealthResource {

    @Autowired
    private HealthRepository repository;

    @GET
    @Path("{id}")
    @JacksonFeatures(serializationEnable = SerializationFeature.WRAP_ROOT_VALUE,
            deserializationEnable = DeserializationFeature.UNWRAP_ROOT_VALUE)
    public Health get(@PathParam("id") String id) {
        return repository.findOne(id);
    }

    @POST
    @JacksonFeatures(serializationEnable = SerializationFeature.WRAP_ROOT_VALUE,
            deserializationEnable = DeserializationFeature.UNWRAP_ROOT_VALUE)
    public Health create(Health health) throws Exception {
        return repository.save(health);
    }

}
