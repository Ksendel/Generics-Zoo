package com.company;

public class LionCage extends MammalCage<Lion> {

    private final Lion[] lions;
    public LionCage(int seatsNumber) {
        super();
        lions = new Lion[seatsNumber];
    }

    @Override
    public Lion[] getAnimals() { return lions; }
}
