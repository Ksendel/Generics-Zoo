package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UngulateCageTest {

    @Test
    public void addAnimal() {
        UngulateCage ungulateCage = new UngulateCage(3);
        Zebra[] arr = new Zebra[]{
                new Zebra(), new Zebra(), new Zebra()
        };
        for (Zebra a : arr) {
            ungulateCage.addAnimal(a);
        }

        assert ungulateCage.getCountOfAnimals() == 3;
        assertArrayEquals(arr, ungulateCage.getAnimals());



        Giraffe giraffe = new Giraffe();
        try {
            ungulateCage.addAnimal(giraffe);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalStateException e) {
            assertEquals("No seats", e.getMessage());
        }



    }

    @Test
    public void deleteAnimal() {
        UngulateCage ungulateCage = new UngulateCage(3);
        Zebra[] arr = new Zebra[]{
                new Zebra(), new Zebra(), new Zebra()
        };
        for (Zebra a : arr) {
            ungulateCage.addAnimal(a);
        }
        assert ungulateCage.getCountOfAnimals() == 3;
        assertArrayEquals(arr, ungulateCage.getAnimals());

        ungulateCage.deleteAnimal(1);
        assert ungulateCage.getCountOfAnimals() == 2;

    }

    @Test
    public void getCountOfAnimals() {
        UngulateCage ungulateCage = new UngulateCage(3);
        Zebra[] arr = new Zebra[]{
                new Zebra(), new Zebra(), new Zebra()
        };
        for (Zebra a : arr) {
            ungulateCage.addAnimal(a);
        }

        int expectedCount = 0;
        for (Ungulate b : ungulateCage.getAnimals())
            if (b != null) expectedCount++;

        assert ungulateCage.getCountOfAnimals() == expectedCount;
    }


}