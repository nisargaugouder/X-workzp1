package com.xworkz.assignment.internal.scissors;

public class Scissors {
    private String brand;
    private String type;
    private double length;

    public Scissors(String brand, String type, double length) {
        this.brand = brand;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Scissors{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ScissorsHashCode:"+super.hashCode());
        return 425;
    }
}
