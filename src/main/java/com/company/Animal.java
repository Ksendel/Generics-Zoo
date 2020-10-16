package com.company;

public class Animal {
    private int id;
    private static int countId = 0;

    public Animal() {
        countId++;
        this.id = countId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

