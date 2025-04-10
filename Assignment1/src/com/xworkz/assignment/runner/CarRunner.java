package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.car.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(car));
    }
}
