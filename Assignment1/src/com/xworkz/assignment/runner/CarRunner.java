package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.car.Car;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(car));

        Car car1 = new Car("Hyundai", "Verna", 2021);
        Car car2 = new Car("Honda", "City", 2023);

        boolean same = car1.equals(car2);
        System.out.println("same:" + same);
    }
}
