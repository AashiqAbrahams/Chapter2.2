package com.walmers;

public class Wolf extends Animal {

    public Wolf() {
        super("Wolf");
    }
    public String sound(){
        return "howl";
    }
    public String move() {
        return "wolf running";
    }
}
