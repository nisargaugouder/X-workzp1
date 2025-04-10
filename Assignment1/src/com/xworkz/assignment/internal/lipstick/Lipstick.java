package com.xworkz.assignment.internal.lipstick;

public class Lipstick {
    private String brand;
    private String shade;
    private int price;

    public Lipstick(String brand, String shade, int price) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lipstick{brand='" + brand + "', shade='" + shade + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LipstickHashCode:"+super.hashCode());
        return 8332;
    }
}
