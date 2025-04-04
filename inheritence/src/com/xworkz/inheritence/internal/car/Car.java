package com.xworkz.inheritence.internal.car;

public class Car {
    public Car() {
        System.out.println("Running non-arg constructor Car--parent");
    }
    public void transport() {
        System.out.println("Cars are used for transportation--parent");
    }
    public void wheels() {
        System.out.println("Cars typically have four wheels--parent");
    }
    public void engine() {
        System.out.println("Traditional cars are powered by an internal combustion engine--parent");
    }
    public void models() {
        System.out.println("Cars come in various models and designs--parent");
    }
    public void comfort() {
        System.out.println("Cars have comfort features like AC, seats, and music systems--parent");
    }
}
