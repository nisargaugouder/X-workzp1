package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.vehicle.Vehicle;
import com.xworkz.inheritence.internal.vehicle.Car;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.stop();
        vehicle.fuel();
        vehicle.speed();
        vehicle.transport();

        System.out.println("-----------");

        Vehicle vehicle2 = new Car();
        vehicle2.move();
        vehicle2.stop();
        vehicle2.fuel();
        vehicle2.speed();
        vehicle2.transport();

        System.out.println("-----------");

        Car car = new Car();
        car.move();
        car.stop();
        car.fuel();
        car.speed();
        car.transport();
    }
}
