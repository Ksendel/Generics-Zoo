package com.company;

public abstract class Cage<T extends Animal> {
    private int countOfAnimals;

    public Cage() {
        countOfAnimals = 0;
    }

    public abstract T[] getAnimals();

    public int getSeatsNumber() {
        return getAnimals().length;
    }

    public boolean isFull() {
        return countOfAnimals >= getSeatsNumber();
    }

    public void addAnimal(T animal) {
        if (isFull()) throw new IllegalStateException("No seats");
        else {
            getAnimals()[countOfAnimals] = animal;
            countOfAnimals++;
        }
    }

    public void deleteAnimal(int id) {
        boolean found = false;
        for (int i = 0; i < getSeatsNumber(); i++) {
            if (getAnimals()[i].getId() == id) {
                found = true;
                getAnimals()[i] = null;
                countOfAnimals--;
            }
        }
        if (!found) throw new IllegalStateException("There is no such animal");
    }


    public int getCountOfAnimals() {
        return countOfAnimals;
    }
}

