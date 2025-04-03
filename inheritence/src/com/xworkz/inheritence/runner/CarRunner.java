package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.car.Car;
import com.xworkz.inheritence.internal.car.ElectricCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new ElectricCar();
        car.usedForTransportation();
        car.hasFourWheels();
        car.poweredByEngine();
        car.comesInVariousModels();
        car.hasComfortFeatures();

        System.out.println("-----------------");
        ElectricCar electricCar = new ElectricCar();
        electricCar.usedForTransportation();
        electricCar.hasFourWheels();
        electricCar.poweredByEngine();
        electricCar.comesInVariousModels();
        electricCar.hasComfortFeatures();
    }
}
