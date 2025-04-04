package com.xworkz.inheritence.internal.caboard;

public class Caboard {
    public Caboard() {
        System.out.println("Running non-arg constructor Caboard--parent");
    }
    public void lock() {
        System.out.println("Caboard has a lock--parent");
    }
    public void key() {
        System.out.println("Caboard has a key--parent");
    }
    public void handle() {
        System.out.println("Caboard has a handle--parent");
    }
    public void open() {
        System.out.println("Caboard can be opened--parent");
    }
    public void close() {
        System.out.println("Caboard can be closed--parent");
    }
}
