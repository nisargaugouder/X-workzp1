package com.xworkz.assignment.internal.elephant;

public class Elephant {
    private int age;
    private double weight;
    private String species;

    public Elephant(int age, double weight, String species) {
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
