package com.xworkz.assignment.internal.milk;

public class Milk {
    private String brand;
    private String type;
    private int price;

    public Milk(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }
}
