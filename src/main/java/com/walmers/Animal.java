package com.walmers;

import com.walmers.Interfaces.Move;
import com.walmers.Interfaces.Sound;

public abstract class Animal implements Sound, Move {

    private String type;

    public Animal(String type){
        this.type = type;
    }

    public String getAnimalType() {
        return type;
    }

    public void setAnimalType(String type) {
        this.type = type;
    }



}
