package com.xworkz.inheritence.internal.caboard;

public class Door extends Caboard {
    public Door() {
        super();
        System.out.println("Running non-arg constructor Door");
    }
    @Override
    public void lock() {
        System.out.println("Door can be locked securely--child");
    }
    @Override
    public void key() {
        System.out.println("Door has a key for security--child");
    }
    @Override
    public void handle() {
        System.out.println("Door has a stylish handle--child");
    }
    @Override
    public void open() {
        System.out.println("Door can be opened easily--child");
    }
    @Override
    public void close() {
        System.out.println("Door closes smoothly--child");
    }
}
