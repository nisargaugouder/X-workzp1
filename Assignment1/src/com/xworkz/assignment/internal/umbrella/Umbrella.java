package com.xworkz.assignment.internal.umbrella;

public class Umbrella {
    private String color;
    private String size;
    private boolean isAutomatic;

    public Umbrella(String color, String size, boolean isAutomatic) {
        this.color = color;
        this.size = size;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "Umbrella{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", isAutomatic=" + isAutomatic +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("UmbrellaHashCode:"+super.hashCode());
        return 41;
    }
}
