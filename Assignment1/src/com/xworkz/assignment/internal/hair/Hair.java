package com.xworkz.assignment.internal.hair;

public class Hair {
    private String color;
    private String type;
    private double length;

    public Hair(String color, String type, double length) {
        this.color = color;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hair{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("HairHashCode:"+super.hashCode());
        return 56;
    }
}
