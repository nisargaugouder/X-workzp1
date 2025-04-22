package com.xworkz.late.internal.battery;

public class BatteryCellImpl implements Battery {
    public BatteryCellImpl() {
        System.out.println("no-arg constructor of BatteryCellImpl");
    }

    @Override
    public void charge() {
        System.out.println("Charging the battery");
    }
}
