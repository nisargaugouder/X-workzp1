package com.xworkz.assignment.internal.vegetable;

public class Vegetable {
    private String name;
    private String color;
    private double weight;

    public Vegetable(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
