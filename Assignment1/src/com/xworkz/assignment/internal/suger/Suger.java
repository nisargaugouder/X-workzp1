package com.xworkz.assignment.internal.suger;

public class Suger {
    private String type;
    private int price;
    private String color;

    public Suger(String type, int price, String color) {
        this.type = type;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Suger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
