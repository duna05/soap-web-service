package org.acme.cxf;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

import javax.inject.Named;
import javax.jws.WebService;

@WebService(endpointInterface = "org.acme.cxf.FruitWebService")
public class FruitWebServiceImpl implements FruitWebService {

    private Set<Fruit> fruits = Collections.synchronizedSet(new HashSet<>());

    public FruitWebServiceImpl() {
        fruits.add(new Fruit("Manzana", "Winter fruit"));
        fruits.add(new Fruit("Piña", "Tropical fruit"));
        fruits.add(new Fruit("Pera", "Winter fruit"));
        fruits.add(new Fruit("Cambur", "Tropical fruit"));
    }

    @Override
    public Set<Fruit> list() {
        return fruits;
    }

    @Override
    public Set<Fruit> add(Fruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    @Override
    public Set<Fruit> delete(Fruit fruit) {
        fruits.remove(fruit);
        return fruits;
    }
}