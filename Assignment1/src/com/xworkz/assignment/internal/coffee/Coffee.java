package com.xworkz.assignment.internal.coffee;

public class Coffee {
    private String type;
    private String size;
    private double price;

    public Coffee(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
