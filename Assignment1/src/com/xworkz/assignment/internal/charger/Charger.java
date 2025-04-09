package com.xworkz.assignment.internal.charger;

public class Charger {
    private String brand;
    private int outputVoltage;
    private boolean isFastCharging;

    public Charger(String brand, int outputVoltage, boolean isFastCharging) {
        this.brand = brand;
        this.outputVoltage = outputVoltage;
        this.isFastCharging = isFastCharging;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "brand='" + brand + '\'' +
                ", outputVoltage=" + outputVoltage +
                ", isFastCharging=" + isFastCharging +
                '}';
    }
}
