package com.xworkz.assignment.internal.pant;

public class Pant {
    private String brand;
    private String size;
    private String color;

    public Pant(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pant{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PantHashCode:"+super.hashCode());
        return 6320;
    }
}
