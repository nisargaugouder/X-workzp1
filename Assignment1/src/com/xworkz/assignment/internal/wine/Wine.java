package com.xworkz.assignment.internal.wine;

public class Wine {
    private String brand;
    private String type;
    private int price;

    public Wine(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("WineHashCode:"+super.hashCode());
        return 5421;
    }
}
