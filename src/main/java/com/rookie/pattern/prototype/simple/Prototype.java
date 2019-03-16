package com.rookie.pattern.prototype.simple;

import java.io.IOException;

public interface Prototype {

    Prototype clone();

    Prototype deepClone() throws IOException, ClassNotFoundException;
}
