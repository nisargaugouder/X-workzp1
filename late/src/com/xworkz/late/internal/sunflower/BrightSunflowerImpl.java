package com.xworkz.late.internal.sunflower;

public class BrightSunflowerImpl implements Sunflower {
    public BrightSunflowerImpl() {
        System.out.println("no-arg const BrightSunflowerImpl");
    }

    @Override
    public void faceSun() {
        System.out.println("Sunflower is facing the sun");
    }
}
