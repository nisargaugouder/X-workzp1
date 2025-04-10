package com.xworkz.assignment.internal.fish;

public class Fish {
    private String name;
    private String color;
    private double weight;

    public Fish(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fish{name=" + name + ", color=" + color + ", weight=" + weight + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FishHashCode:"+super.hashCode());
        return 841;
    }
}
