package com.xworkz.inheritence.internal.beverage;

public class Beverage {
    public Beverage() {
        System.out.println("Running non-arg constructor of Beverage");
    }
    public void drink() {
        System.out.println("Beverage is for drinking");
    }
    public void temperature() {
        System.out.println("Beverage can be hot or cold");
    }
    public void flavor() {
        System.out.println("Beverage has different flavors");
    }
    public void refresh() {
        System.out.println("Beverage is refreshing");
    }
}
