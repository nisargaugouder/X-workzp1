package com.xworkz.late.internal.car;

public class ElectricCarImpl implements Car {
    public ElectricCarImpl() {
        System.out.println("no-arg const ElectricCarImpl");
    }

    @Override
    public void drive() {
        System.out.println("driving in ElectricCarImpl");
    }
}
