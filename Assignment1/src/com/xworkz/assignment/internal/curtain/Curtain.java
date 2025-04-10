package com.xworkz.assignment.internal.curtain;

public class Curtain {
    private String color;
    private String material;
    private int length;

    public Curtain(String color, String material, int length) {
        this.color = color;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Curtain{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CurtainHashCode:"+super.hashCode());
        return 546;
    }
}
