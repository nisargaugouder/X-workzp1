package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.car.Car;
import com.xworkz.inheritence.internal.car.ElectricCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.transport();
        car1.wheels();
        car1.engine();
        car1.models();
        car1.comfort();

        System.out.println("-------------------");
        Car car2 = new ElectricCar();
        car2.transport();
        car2.wheels();
        car2.engine();
        car2.models();
        car2.comfort();

        System.out.println("-----------------");
        ElectricCar electricCar = new ElectricCar();
        electricCar.transport();
        electricCar.wheels();
        electricCar.engine();
        electricCar.models();
        electricCar.comfort();
    }
}
