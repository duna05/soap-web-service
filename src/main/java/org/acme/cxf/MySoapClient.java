package org.acme.cxf;
 // SEI
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkiverse.cxf.annotation.CXFClient;

@ApplicationScoped  // or any other CDI scope
public class MySoapClient {

    @Inject
    FruitWebService clientService;

    public int getCount() {
        return this.clientService.list().size();
    }
}