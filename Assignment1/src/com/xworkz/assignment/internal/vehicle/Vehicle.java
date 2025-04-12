package com.xworkz.assignment.internal.vehicle;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("VehicleHashCode:"+super.hashCode());
        return 811;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Vehicle){
                System.out.println("obj instance of class");
                Vehicle vehicle1=this;
                Vehicle vehicle2=(Vehicle) obj;
                if(vehicle1.make.equals(vehicle2.make) && vehicle1.year==vehicle2.year && vehicle1.model.equals(vehicle2.model)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
