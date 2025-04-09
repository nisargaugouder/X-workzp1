package com.xworkz.assignment.internal.bangles;

public class Bangles {
    private String material;
    private String color;
    private int quantity;

    public Bangles() {
        System.out.println("Running no-arg constructor of Bangles");
        this.material = "Gold";
        this.color = "Yellow";
        this.quantity = 2;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Quantity: " + quantity;
    }
}
