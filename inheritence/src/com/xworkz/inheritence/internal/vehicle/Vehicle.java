package com.xworkz.inheritence.internal.vehicle;

public class Vehicle {
    public Vehicle() {
        System.out.println("Vehicle --parent");
    }

    public void move() {
        System.out.println("Vehicle moves --parent");
    }

    public void stop() {
        System.out.println("Vehicle stops --parent");
    }

    public void fuel() {
        System.out.println("Vehicle needs fuel --parent");
    }

    public void speed() {
        System.out.println("Vehicle has speed --parent");
    }

    public void transport() {
        System.out.println("Vehicle is used for transport --parent");
    }
}
