package com.xworkz.inheritence.internal.appliance;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("Running non-arg constructor WashingMachine");
    }
    @Override
    public void powerOn() {
        System.out.println("WashingMachine is powered on--child");
    }
    @Override
    public void powerOff() {
        System.out.println("WashingMachine is powered off--child");
    }
    @Override
    public void consumeElectricity() {
        System.out.println("WashingMachine consumes electricity--child");
    }
    @Override
    public void function() {
        System.out.println("WashingMachine washes clothes--child");
    }
    @Override
    public void brand() {
        System.out.println("WashingMachine has a specific brand--child");
    }
}
