package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.car.Car;
import com.xworkz.application.inheritancetype.car.ElectricCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car=new Car();
        ElectricCar electricCar = new ElectricCar();

        car.drive();
        electricCar.charge();
        electricCar.drive(); // inherited method
    }
}
