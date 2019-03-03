package com.walmers;

public class Horse extends Animal {

    public Horse() {
        super("Horse");
    }
    public String sound(){

        return "neighs";
    }
    public String move() {

        return "gallops";
    }
}
