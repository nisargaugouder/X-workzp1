package com.xworkz.assignment.internal.cupboard;

public class Cupboard {
    private String type;
    private int shelves;
    private String color;

    public Cupboard(String type, int shelves, String color) {
        this.type = type;
        this.shelves = shelves;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "type='" + type + '\'' +
                ", shelves=" + shelves +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CupboardHashCode:"+super.hashCode());
        return 563;
    }
}
