package com.xworkz.inheritence.internal.switchs;

public class ElectricSwitch extends Switch {
    public ElectricSwitch() {
        super();
        System.out.println("ElectricSwitch --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Electric switch turns on appliances --child");
    }

    @Override
    public void turnOff() {
        System.out.println("Electric switch turns off appliances --child");
    }

    @Override
    public void saveElectricity() {
        System.out.println("Smart electric switches save more electricity --child");
    }

    @Override
    public void designs() {
        System.out.println("Electric switches have modern touch designs --child");
    }

    @Override
    public void usage() {
        System.out.println("Electric switches are widely used in smart homes --child");
    }
}
