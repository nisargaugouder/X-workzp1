package com.xworkz.inheritence.internal.bed;

public class Bed {
    public Bed() {
        System.out.println("Running non-arg constructor Bed--parent");
    }
    public void sleep() {
        System.out.println("Bed is used for sleeping--parent");
    }
    public void fold() {
        System.out.println("Bed can be folded--parent");
    }
    public void comfort() {
        System.out.println("Bed provides comfort--parent");
    }
    public void decorate() {
        System.out.println("Bed is decorated with sheets and pillows--parent");
    }
    public void adjust() {
        System.out.println("Some beds have adjustable height--parent");
    }
}
