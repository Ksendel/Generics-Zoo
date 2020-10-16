package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BirdCageTest {

    @Test
    public void addAnimal() {
        BirdCage birdCage = new BirdCage(3);
        Bird[] arr = new Bird[]{
                new Bird(), new Bird(), new Bird()
        };
        for (Bird a : arr) {
            birdCage.addAnimal(a);
        }
        assert birdCage.getCountOfAnimals() == 3;
        assertArrayEquals(arr, birdCage.getAnimals());

        Bird bird = new Bird();
        try {
            birdCage.addAnimal(bird);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalStateException e) {
            assertEquals("No seats", e.getMessage());
        }

    }

    @Test
    public void deleteAnimal() {
        BirdCage birdCage = new BirdCage(3);
        Bird[] arr = new Bird[]{
                new Bird(), new Bird(), new Bird()
        };
        for (Bird a : arr) {
            birdCage.addAnimal(a);
        }

        assert birdCage.getCountOfAnimals() == 3;
        assertArrayEquals(arr, birdCage.getAnimals());

        birdCage.deleteAnimal(1);
        assert birdCage.getCountOfAnimals() == 2;

    }

    @Test
    public void getCountOfAnimals() {
        BirdCage birdCage = new BirdCage(3);
        Bird[] birds = new Bird[]{
                new Bird(), new Bird(), new Bird()
        };
        for (Bird b : birds) {
            birdCage.addAnimal(b);
        }

        int expectedCount = 0;
        for (Bird b : birdCage.getAnimals())
            if (b != null) expectedCount++;

        assert birdCage.getCountOfAnimals() == expectedCount;
    }


}