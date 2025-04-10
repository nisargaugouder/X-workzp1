package com.xworkz.assignment.internal.stationary;

public class Stationary {
    private String item;
    private int price;
    private String brand;

    public Stationary(String item, int price, String brand) {
        this.item = item;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Stationary{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("StationaryHashCode:"+super.hashCode());
        return 51;
    }
}
