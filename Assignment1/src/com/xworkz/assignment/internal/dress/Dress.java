package com.xworkz.assignment.internal.dress;

public class Dress {
    private String type;
    private String size;
    private String color;

    public Dress(String type, String size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("DressHashCode:"+super.hashCode());
        return 451;
    }
}
