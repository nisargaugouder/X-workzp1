package com.xworkz.inheritence.internal.pen;

public class Pen {
    public Pen() {
        System.out.println("Pen --parent");
    }

    public void write() {
        System.out.println("Pen is used for writing --parent");
    }

    public void inkFlow() {
        System.out.println("Pen ensures smooth ink flow --parent");
    }

    public void cap() {
        System.out.println("Pen has a protective cap --parent");
    }

    public void refill() {
        System.out.println("Pen can be refilled with ink --parent");
    }

    public void grip() {
        System.out.println("Pen has a comfortable grip --parent");
    }
}
