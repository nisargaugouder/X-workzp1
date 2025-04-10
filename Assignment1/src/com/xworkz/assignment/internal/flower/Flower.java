package com.xworkz.assignment.internal.flower;

public class Flower {
    private String name;
    private String color;
    private int petals;

    public Flower(String name, String color, int petals) {
        this.name = name;
        this.color = color;
        this.petals = petals;
    }

    @Override
    public String toString() {
        return "Flower{name=" + name + ", color=" + color + ", petals=" + petals + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FlowerHashCode:"+super.hashCode());
        return 841;
    }
}
