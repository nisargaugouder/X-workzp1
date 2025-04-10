package com.xworkz.assignment.internal.mug;

public class Mug {
    private String color;
    private String material;
    private int price;

    public Mug(String color, String material, int price) {
        this.color = color;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mug{color='" + color + "', material='" + material + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MugHashCode:"+super.hashCode());
        return 62;
    }
}
