package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.vehicle.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Honda", "City", 2020);
        System.out.println(vehicle);
        System.out.println(vehicle.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(vehicle));

        Vehicle vehicle1 = new Vehicle("Honda", "City", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "City", 2020);

        boolean same = vehicle1.equals(vehicle2);
        System.out.println("same: " + same);
    }
}
