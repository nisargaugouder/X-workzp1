package com.xworkz.inheritence.internal.car;

public class ElectricCar extends Car {
    public ElectricCar() {
        super();
        System.out.println("Running non-arg constructor ElectricCar--child");
    }
    @Override
    public void transport() {
        System.out.println("Cars are used for transportation--child");
    }
    @Override
    public void wheels() {
        System.out.println("Cars typically have four wheels--child");
    }
    @Override
    public void engine() {
        System.out.println("Electric cars are powered by batteries--child");
    }
    @Override
    public void models() {
        System.out.println("Electric cars come in various models--child");
    }
    @Override
    public void comfort() {
        System.out.println("Electric cars offer modern comfort features--child");
    }

    public void size(){
        System.out.println("new method size in child class");
    }
}
