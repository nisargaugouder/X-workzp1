package com.xworkz.assignment.internal.watch;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("WatchHashCode:"+super.hashCode());
        return 643;
    }
}
