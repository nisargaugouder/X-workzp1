package com.xworkz.assignment.internal.food;

public class Food {
    private String name;
    private double price;
    private String type;

    public Food(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food{name=" + name + ", price=" + price + ", type=" + type + "}";
    }
}
