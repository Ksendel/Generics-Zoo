package com.company;

public class BirdCage extends Cage<Bird> {

    private final Bird[] birds;
    public BirdCage(int seatsNumber){
        super();
        birds = new Bird[seatsNumber];
    }

    @Override
    public Bird[] getAnimals() {
        return birds;
    }
}

