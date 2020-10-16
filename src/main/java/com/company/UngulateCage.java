package com.company;

public class UngulateCage extends MammalCage<Ungulate> {

    private final Ungulate[] ungulates;

    public UngulateCage(int seatsNumber){
        super();
        ungulates = new Ungulate[seatsNumber];
    }

    @Override
    public Ungulate[] getAnimals() {
        return ungulates;
    }
}
