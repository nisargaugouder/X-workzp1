package com.xworkz.inheritence.internal.bottle;

public class Cap extends Bottle {

    public Cap() {
        super();
        System.out.println("Running no-arg constructor Cap -- Child Class");
    }

    @Override
    public void fill() {
        System.out.println("Cap covers the bottle -- Child Class");
    }

    @Override
    public void storeWater() {
        System.out.println("Cap protects water in the bottle -- Child Class");
    }

    @Override
    public void storeMilk() {
        System.out.println("Cap protects milk in the bottle -- Child Class");
    }

    @Override
    public void madeOfGlass() {
        System.out.println("Cap is made of plastic -- Child Class");
    }

    @Override
    public void frozen() {
        System.out.println("Cap can also be frozen -- Child Class");
    }

    public void seal() {
        System.out.println("New method seal() in child class Cap");
    }
}
