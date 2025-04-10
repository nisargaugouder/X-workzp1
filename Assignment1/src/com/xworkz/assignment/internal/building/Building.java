package com.xworkz.assignment.internal.building;

public class Building {
    private String name;
    private int floors;
    private String location;

    public Building(String name, int floors, String location) {
        this.name = name;
        this.floors = floors;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", floors=" + floors +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("BuildHashCode:"+super.hashCode());
        return 238;

    }
}
