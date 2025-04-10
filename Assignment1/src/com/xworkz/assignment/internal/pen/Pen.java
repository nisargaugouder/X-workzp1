package com.xworkz.assignment.internal.pen;

public class Pen {
    private String brand;
    private String color;
    private int price;

    public Pen() {
        System.out.println("Running no-arg constructor of Pen");
        this.brand = "Reynolds";
        this.color = "Blue";
        this.price = 10;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " Color: " + color + " Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PenHashCode:"+super.hashCode());
        return 841;
    }
}
