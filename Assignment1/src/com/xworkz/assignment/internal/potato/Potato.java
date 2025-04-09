package com.xworkz.assignment.internal.potato;

public class Potato {
    private String variety;
    private double weight;
    private String origin;

    public Potato(String variety, double weight, String origin) {
        this.variety = variety;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "variety='" + variety + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
