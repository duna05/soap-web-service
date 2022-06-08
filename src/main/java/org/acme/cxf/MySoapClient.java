package org.acme.cxf;
 // SEI
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkiverse.cxf.annotation.CXFClient;

import java.util.List;
import java.util.Set;

@ApplicationScoped  // or any other CDI scope
public class MySoapClient {

    @Inject
    FruitWebService clientService;

    public int getCount() {
        return this.clientService.list().size();
    }

    public Set<Fruit> getList(){
       return this.clientService.list();
    }
}