package com.xworkz.inheritence.internal.bottle;

public class Bottle {
    public Bottle() {
        System.out.println("Running non-arg constructor Bottle--parent");
    }
    public void fill() {
        System.out.println("Bottle is filled with liquid--parent");
    }
    public void storeWater() {
        System.out.println("Bottle stores water--parent");
    }
    public void storeMilk() {
        System.out.println("Bottle stores milk--parent");
    }
    public void madeOfGlass() {
        System.out.println("Some bottles are made of glass--parent");
    }
    public void frozen() {
        System.out.println("Bottle can be frozen--parent");
    }
}
