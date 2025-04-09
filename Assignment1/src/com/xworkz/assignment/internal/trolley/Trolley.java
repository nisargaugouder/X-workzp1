package com.xworkz.assignment.internal.trolley;

public class Trolley {
    private String type;
    private double capacity;
    private boolean isMotorized;

    public Trolley(String type, double capacity, boolean isMotorized) {
        this.type = type;
        this.capacity = capacity;
        this.isMotorized = isMotorized;
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", isMotorized=" + isMotorized +
                '}';
    }
}
