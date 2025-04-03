package com.xworkz.inheritence.internal.pizza;

public class Pizza {
    public Pizza() {
        System.out.println("Running non-arg constructor Pizza");
    }
    public void hasCrust() {
        System.out.println("Pizza has a crust made of dough");
    }
    public void toppedWithSauce() {
        System.out.println("Pizza is topped with tomato or white sauce");
    }
    public void includesCheese() {
        System.out.println("Pizza often has cheese as a key ingredient");
    }
    public void availableInDifferentFlavors() {
        System.out.println("Pizza comes in different flavors like Margherita, Pepperoni, and BBQ Chicken");
    }
    public void cookedInOven() {
        System.out.println("Pizza is baked in an oven for a crispy crust");
    }
}
