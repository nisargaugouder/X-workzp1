package com.xworkz.assignment.internal.pig;

public class Pig {
    private String breed;
    private int age;
    private double weight;

    public Pig(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
