package com.xworkz.inheritence.internal.car;

public class Rent {
    public void rentCar(Car car){
        car.comfort();
        car.engine();
        car.models();
        car.wheels();
        car.transport();

        if(car instanceof ElectricCar){
            System.out.println("car instanceof ElectricCar");
            ElectricCar electricCar=(ElectricCar) car;
            electricCar.size();
        }
    }
}
