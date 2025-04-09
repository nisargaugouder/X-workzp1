package com.xworkz.assignment.internal.kurtha;

public class Kurtha {
    private String fabric;
    private String size;
    private String color;

    public Kurtha(String fabric, String size, String color) {
        this.fabric = fabric;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kurtha{" +
                "fabric='" + fabric + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
