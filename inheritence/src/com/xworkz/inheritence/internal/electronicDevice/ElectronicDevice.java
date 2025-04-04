package com.xworkz.inheritence.internal.electronicDevice;

public class ElectronicDevice {
    public ElectronicDevice() {
        System.out.println("ElectronicDevice created --parent");
    }

    public void powerOn() {
        System.out.println("Device powering on --parent");
    }

    public void powerOff() {
        System.out.println("Device shutting down --parent");
    }

    public void battery() {
        System.out.println("Checking battery status --parent");
    }

    public void charge() {
        System.out.println("Charging device --parent");
    }

    public void connect() {
        System.out.println("Connecting to network --parent");
    }
}
