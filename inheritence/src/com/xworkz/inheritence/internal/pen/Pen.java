package com.xworkz.inheritence.internal.pen;

public class Pen {
    public Pen() {
        System.out.println("Running non-arg constructor Pen");
    }
    public void write() {
        System.out.println("Pen is writing");
    }
    public void inkFlow() {
        System.out.println("Pen has ink flow");
    }
    public void cap() {
        System.out.println("Pen has a cap");
    }
    public void refill() {
        System.out.println("Pen can be refilled");
    }
}
