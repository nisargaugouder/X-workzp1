package com.xworkz.assignment.internal.electronicdevice;

public class ElectronicDevice {
    private String name;
    private String brand;
    private int warrantyPeriod;

    public ElectronicDevice(String name, String brand, int warrantyPeriod) {
        this.name = name;
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }
}
