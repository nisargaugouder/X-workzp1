package com.xworkz.inheritence.internal.bottle;

public class Cap extends Bottle {
    public Cap() {
        super();
        System.out.println("Running non-arg constructor Cap");
    }
    @Override
    public void fill() {
        System.out.println("Cap prevents bottle from spilling--child");
    }
    @Override
    public void storeWater() {
        System.out.println("Cap ensures water stays inside the bottle--child");
    }
    @Override
    public void storeMilk() {
        System.out.println("Cap keeps milk fresh inside the bottle--child");
    }
    @Override
    public void madeOfGlass() {
        System.out.println("Some caps are also made of glass--child");
    }
    @Override
    public void frozen() {
        System.out.println("Cap ensures frozen bottle contents remain sealed--child");
    }
}
