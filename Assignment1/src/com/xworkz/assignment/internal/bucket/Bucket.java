package com.xworkz.assignment.internal.bucket;

public class Bucket {
    private int capacity;
    private String material;
    private String color;

    public Bucket(int capacity, String material, String color) {
        this.capacity = capacity;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "capacity=" + capacity +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("BuketHashCode:"+super.hashCode());
        return 39;

    }
}
