package com.rookie.pattern.prototype.simple;

import java.io.IOException;

public class Client {

    public Prototype deepClone(Prototype concretePorototype) throws IOException, ClassNotFoundException {
        return concretePorototype.deepClone();
    }

    public Prototype shallowClone(Prototype concretePrototype) {
        return concretePrototype.clone();
    }
}
