package com.xworkz.assignment.internal.lock;

public class Lock {
    private String brand;
    private String type;
    private int price;

    public Lock(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lock{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }
}
