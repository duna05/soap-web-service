package org.acme.cxf;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fruit")
public class FruitResource {

    @Inject
    MySoapClient service;

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public int getCount(){
        return service.getCount();
    }
}