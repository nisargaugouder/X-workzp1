package com.xworkz.application.internal.ring;

public class Circle extends Ring {

    public Circle(String purpose, int size, double cost, String material) {
        super(purpose, size, cost, material);
    }

    public Circle(String purpose, int size) {
        super(purpose, size);
    }

    public Circle(double cost, String material) {
        super(cost, material);
    }
}
