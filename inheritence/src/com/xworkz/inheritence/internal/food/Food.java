package com.xworkz.inheritence.internal.food;

public class Food {
    public Food() {
        System.out.println("Food -- parent");
    }

    public void eat() {
        System.out.println("Eating -- parent");
    }

    public void taste() {
        System.out.println("Has taste -- parent");
    }

    public void cook() {
        System.out.println("Cooking -- parent");
    }

    public void health() {
        System.out.println("Healthy -- parent");
    }

    public void spice() {
        System.out.println("Spicy -- parent");
    }
}
