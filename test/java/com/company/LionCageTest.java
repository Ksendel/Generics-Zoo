package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LionCageTest {

    @Test
    public void addAnimal() {
        LionCage lionCage = new LionCage(3);
        Lion[] arr = new Lion[]{
                new Lion(), new Lion(), new Lion()
        };
        for (Lion a : arr) {
            lionCage.addAnimal(a);
        }
        assert lionCage.getCountOfAnimals() == 3;
        assertArrayEquals(arr, lionCage.getAnimals());

        Lion lion = new Lion();
        try {
            lionCage.addAnimal(lion);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalStateException e) {
            assertEquals("No seats", e.getMessage());
        }

    }

    @Test
    public void deleteAnimal() {
        LionCage lionCage = new LionCage(3);
        Lion[] arr = new Lion[]{
                new Lion(), new Lion(), new Lion()
        };
        for (Lion a : arr) {
            lionCage.addAnimal(a);
        }

        assert lionCage.getCountOfAnimals() == 3;
        assertArrayEquals(arr, lionCage.getAnimals());

        lionCage.deleteAnimal(1);
        assert lionCage.getCountOfAnimals() == 2;

    }

    @Test
    public void getCountOfAnimals() {
        LionCage lionCage = new LionCage(3);
        Lion[] arr = new Lion[]{
                new Lion(), new Lion(), new Lion()
        };
        for (Lion a : arr) {
            lionCage.addAnimal(a);
        }

        int expectedCount = 0;
        for (Lion b : lionCage.getAnimals())
            if (b != null) expectedCount++;

        assert lionCage.getCountOfAnimals() == expectedCount;
    }

}