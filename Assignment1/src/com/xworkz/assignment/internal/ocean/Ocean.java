package com.xworkz.assignment.internal.ocean;

public class Ocean {
    private String name;
    private double area;
    private double depth;

    public Ocean(String name, double area, double depth) {
        this.name = name;
        this.area = area;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                ", area=" + area +
                " million sq km" +
                ", depth=" + depth +
                " meters" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("OceanHashCode:"+super.hashCode());
        return 842;
    }
}
