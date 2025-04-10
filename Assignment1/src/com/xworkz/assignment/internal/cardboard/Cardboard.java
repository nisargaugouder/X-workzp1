package com.xworkz.assignment.internal.cardboard;

public class Cardboard {
    private String type;
    private double thickness;
    private String color;

    public Cardboard(String type, double thickness, String color) {
        this.type = type;
        this.thickness = thickness;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cardboard{" +
                "type='" + type + '\'' +
                ", thickness=" + thickness +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CardBoardHashCode:"+super.hashCode());
        return 34;
    }
}
