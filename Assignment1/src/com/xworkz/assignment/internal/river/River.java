package com.xworkz.assignment.internal.river;

public class River {
    private String name;
    private double length;
    private String origin;

    public River(String name, double length, String origin) {
        this.name = name;
        this.length = length;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "River{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("RiverHashCode:"+super.hashCode());
        return 632;
    }
}
