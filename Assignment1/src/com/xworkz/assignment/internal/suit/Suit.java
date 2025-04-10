package com.xworkz.assignment.internal.suit;

public class Suit {
    private String material;
    private String color;
    private String size;

    public Suit(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SuitHashCode:"+super.hashCode());
        return 545;
    }
}
