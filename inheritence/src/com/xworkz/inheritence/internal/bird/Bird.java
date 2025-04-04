package com.xworkz.inheritence.internal.bird;

public class Bird {
    public Bird() {
        System.out.println("Running non-arg constructor Bird--parent");
    }
    public void fly() {
        System.out.println("Bird can fly--parent");
    }
    public void feathers() {
        System.out.println("Bird has feathers--parent");
    }
    public void layEggs() {
        System.out.println("Bird lays eggs--parent");
    }
    public void sound() {
        System.out.println("Bird makes sounds--parent");
    }
    public void vision() {
        System.out.println("Bird has sharp vision--parent");
    }
}
