package com.xworkz.assignment.internal.mountain;

public class Mountain {
    private String name;
    private int height;
    private String location;

    public Mountain(String name, int height, String location) {
        this.name = name;
        this.height = height;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Mountain{name='" + name + "', height=" + height + ", location='" + location + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("MountainHashCode:"+super.hashCode());
        return 72;
    }
}
