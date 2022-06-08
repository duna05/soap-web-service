package org.acme.cxf;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    @GET
    @Path("/list")
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> getFruits(){
        Set<Fruit> fruits = service.getList();
        List<String> fruitsName = new ArrayList<>();
        for(Fruit fruit: fruits){
            fruitsName.add(fruit.getName());
        }
        return fruitsName;
    }
}