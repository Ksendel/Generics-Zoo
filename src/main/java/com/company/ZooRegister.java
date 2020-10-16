package com.company;

import java.util.ArrayList;

public class ZooRegister {
    public ArrayList<Cage> cages;

    public ZooRegister() {
        this.cages = new ArrayList<>();
    }
    public int getCountOfAnimals() {
        int count = 0;
        for (Cage<?> cage : cages) {
            count += cage.getCountOfAnimals();
        }
        return count;
    }
    public void addCage(Cage<?> cage) {
        cages.add(cage);
    }


}
