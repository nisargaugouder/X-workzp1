package com.xworkz.assignment.internal.suitcase;

public class Suitcase {
    private String brand;
    private double capacity;
    private boolean hasWheels;

    public Suitcase(String brand, double capacity, boolean hasWheels) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasWheels=" + hasWheels +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SuitcaseHashCode:"+super.hashCode());
        return 54;
    }
}
