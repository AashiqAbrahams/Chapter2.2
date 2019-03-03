package com.walmers;

import com.walmers.Interfaces.Move;
import com.walmers.Interfaces.Sound;

public class Animal implements Sound, Move {

    private String type;

    public Animal(String type){

        this.type = type;
        this.sound();
        this.move();
    }

    public String getAnimalType() {

        return type;
    }

    public void setAnimalType(String type) {

        this.type = type;
    }


    @Override
    public String move() {
        return null;
    }

    @Override
    public String sound() {
        return null;
    }
}
