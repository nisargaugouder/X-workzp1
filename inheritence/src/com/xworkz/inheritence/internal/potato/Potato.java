package com.xworkz.inheritence.internal.potato;

public class Potato {
    public Potato() {
        System.out.println("Potato --parent");
    }

    public void grow() {
        System.out.println("Potatoes grow underground --parent");
    }

    public void cook() {
        System.out.println("Potatoes are used in cooking --parent");
    }

    public void carbs() {
        System.out.println("Potatoes contain carbohydrates --parent");
    }

    public void types() {
        System.out.println("Potatoes come in different varieties --parent");
    }

    public void staple() {
        System.out.println("Potatoes are a staple food --parent");
    }
}
