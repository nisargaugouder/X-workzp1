package com.xworkz.assignment.internal.slipper;

public class Slipper {
    private String brand;
    private String material;
    private int size;

    public Slipper(String brand, String material, int size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Slipper{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SlipperHashCode:"+super.hashCode());
        return 82;
    }
}
