package com.xworkz.assignment.internal.cushion;

public class Cushion {
    private String shape;
    private String color;
    private int price;

    public Cushion(String shape, String color, int price) {
        this.shape = shape;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cushion{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
