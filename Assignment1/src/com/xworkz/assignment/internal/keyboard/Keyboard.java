package com.xworkz.assignment.internal.keyboard;

public class Keyboard {
    private String brand;
    private boolean isMechanical;
    private int numberOfKeys;

    public Keyboard(String brand, boolean isMechanical, int numberOfKeys) {
        this.brand = brand;
        this.isMechanical = isMechanical;
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", isMechanical=" + isMechanical +
                ", numberOfKeys=" + numberOfKeys +
                '}';
    }
}
