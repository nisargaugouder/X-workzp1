package com.xworkz.assignment.internal.bird;

public class Bird {
    private String species;
    private String color;
    private double wingspan;

    public Bird() {
        System.out.println("Running no-arg constructor of Bird");
        this.species = "Parrot";
        this.color = "Green";
        this.wingspan = 0.25;
    }

    @Override
    public String toString() {
        return "Species: " + species + ", Color: " + color + ", Wingspan: " + wingspan + " meters";
    }
}
