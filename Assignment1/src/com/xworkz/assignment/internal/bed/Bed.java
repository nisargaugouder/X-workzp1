package com.xworkz.assignment.internal.bed;

public class Bed {
    private String size;
    private String material;
    private boolean hasHeadboard;

    public Bed() {
        System.out.println("Running no-arg constructor of Bed");
        this.size = "Queen";
        this.material = "Wood";
        this.hasHeadboard = true;
    }

    @Override
    public String toString() {
        return "Size: " + size + ", Material: " + material + ", Has Headboard: " + hasHeadboard;
    }

    @Override
    public int hashCode() {
        System.out.println("BedHashCode"+super.hashCode());
        return 15;
    }
}
