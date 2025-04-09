package com.xworkz.assignment.internal.bedsheet;

public class Bedsheet {
    private String material;
    private String color;
    private String size;

    public Bedsheet() {
        System.out.println("Running no-arg constructor of Bedsheet");
        this.material = "Cotton";
        this.color = "White";
        this.size = "King";
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Size: " + size;
    }
}
