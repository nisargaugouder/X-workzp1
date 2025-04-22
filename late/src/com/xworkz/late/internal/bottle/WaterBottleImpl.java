package com.xworkz.late.internal.bottle;

public class WaterBottleImpl implements Bottle {
    public WaterBottleImpl() {
        System.out.println("no-arg constructor of WaterBottleImpl");
    }

    @Override
    public void fill() {
        System.out.println("Filling the water bottle");
    }
}
