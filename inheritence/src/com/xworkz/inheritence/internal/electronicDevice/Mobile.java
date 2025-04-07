package com.xworkz.inheritence.internal.electronicDevice;

public class Mobile extends ElectronicDevice {

    @Override
    public void powerOn() {
        System.out.println("Running powerOn in Mobile");
    }

    @Override
    public void powerOff() {
        System.out.println("Running powerOff in Mobile");
    }

    @Override
    public void battery() {
        System.out.println("Running battery in Mobile");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in Mobile");
    }

    @Override
    public void connect() {
        System.out.println("Running connect in Mobile");
    }

    public void camera() {
        System.out.println("Mobile has a high-quality Camera");
    }
}
