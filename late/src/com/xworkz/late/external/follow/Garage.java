package com.xworkz.late.external.follow;

import com.xworkz.late.internal.car.Car;

public class Garage {
    private Car car;

    public Garage(Car car) {
        this.car = car;
    }

    public void repair() {
        System.out.println("running repair in Garage");
        if (this.car != null) {
            this.car.drive();
        } else {
            System.out.println("error");
        }
    }
}
