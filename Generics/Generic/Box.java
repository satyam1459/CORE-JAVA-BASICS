package Generics.Generic;

public class Box<T> {
    // Object class is the top most parent class of java
    T container;

    public Box(T container) {
        this.container = container;
    }

    public T getValue() {
        return this.container;
    }
}