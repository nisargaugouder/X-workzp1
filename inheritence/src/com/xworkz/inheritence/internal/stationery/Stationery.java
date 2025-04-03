package com.xworkz.inheritence.internal.stationery;

public class Stationery {
    public Stationery() {
        System.out.println("Running non-arg constructor of Stationery");
    }
    public void write() {
        System.out.println("Stationery is used for writing");
    }
    public void erase() {
        System.out.println("Some stationery items can erase");
    }
    public void color() {
        System.out.println("Stationery can be colorful");
    }
    public void size() {
        System.out.println("Stationery comes in different sizes");
    }
}
