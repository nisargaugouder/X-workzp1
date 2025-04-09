package com.xworkz.assignment.internal.bike;

public class Bike {
    private String brand;
    private String model;
    private int engineCapacity;

    public Bike() {
        System.out.println("Running no-arg constructor of Bike");
        this.brand = "Yamaha";
        this.model = "YZF-R15";
        this.engineCapacity = 155;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Engine Capacity: " + engineCapacity + "cc";
    }
}
