package com.xworkz.inheritence.internal.bed;

public class Bed {
    public Bed() {
        System.out.println("Running non-arg constructor Bed");
    }
    public void sleep() {
        System.out.println("Bed is used for sleeping");
    }
    public void fold() {
        System.out.println("Bed can be folded");
    }
    public void comfort() {
        System.out.println("Bed provides comfort");
    }
    public void decorate() {
        System.out.println("Bed is decorated with bedsheets and pillows");
    }
    public void adjustHeight() {
        System.out.println("Some beds have adjustable height");
    }
}
