package com.xworkz.inheritence.internal.appliance;

public class Appliance {
    public Appliance() {
        System.out.println("Running non-arg constructor Appliance--parent");
    }
    public void powerOn() {
        System.out.println("Appliance is powered on--parent");
    }
    public void powerOff() {
        System.out.println("Appliance is powered off--parent");
    }
    public void consumeElectricity() {
        System.out.println("Appliance consumes electricity--parent");
    }
    public void function() {
        System.out.println("Appliance performs a function--parent");
    }
    public void brand() {
        System.out.println("Appliance has a brand--parent");
    }
}
