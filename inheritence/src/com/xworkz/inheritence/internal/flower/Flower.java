package com.xworkz.inheritence.internal.flower;

public class Flower {
    public Flower() {
        System.out.println("Flower -- parent");
    }

    public void bloom() {
        System.out.println("Blooming -- parent");
    }

    public void scent() {
        System.out.println("Has fragrance -- parent");
    }

    public void shade() {
        System.out.println("Has color -- parent");
    }

    public void petals() {
        System.out.println("Has petals -- parent");
    }

    public void pollinate() {
        System.out.println("Pollination occurs -- parent");
    }
}
