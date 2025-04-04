package com.xworkz.inheritence.internal.bike;

public class Bike {
    public Bike() {
        System.out.println("Running non-arg constructor Bike--parent");
    }
    public void transport() {
        System.out.println("Bike is used for transportation--parent");
    }
    public void wheels() {
        System.out.println("Bike has two wheels--parent");
    }
    public void fuel() {
        System.out.println("Bike runs on fuel--parent");
    }
    public void safety() {
        System.out.println("Bike requires a helmet--parent");
    }
    public void model() {
        System.out.println("Bike comes in different models--parent");
    }
}
