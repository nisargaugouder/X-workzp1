package com.xworkz.inheritence.internal.vehicle;

public class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("Car --child");
    }

    @Override
    public void move() {
        System.out.println("Car moves smoothly --child");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with brakes --child");
    }

    @Override
    public void fuel() {
        System.out.println("Car runs on fuel --child");
    }

    @Override
    public void speed() {
        System.out.println("Car has high speed --child");
    }

    @Override
    public void transport() {
        System.out.println("Car transports people --child");
    }
}
