package com.xworkz.assignment.internal.rose;

public class Rose {
    private String color;
    private int numberOfPetals;
    private boolean hasThorns;

    public Rose(String color, int numberOfPetals, boolean hasThorns) {
        this.color = color;
        this.numberOfPetals = numberOfPetals;
        this.hasThorns = hasThorns;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", hasThorns=" + hasThorns +
                '}';
    }
}
