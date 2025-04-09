package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.vehicle.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Honda", "City", 2020);
        System.out.println(vehicle);
    }
}
