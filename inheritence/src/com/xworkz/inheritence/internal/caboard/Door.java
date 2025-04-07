package com.xworkz.inheritence.internal.caboard;

public class Door extends Caboard {

    public Door() {
        super();
        System.out.println("Running no-arg constructor of Door -- Child Class");
    }

    @Override
    public void lock() {
        System.out.println("Locking the door -- Child Class");
    }

    @Override
    public void key() {
        System.out.println("Key is inserted in door -- Child Class");
    }

    @Override
    public void handle() {
        System.out.println("Handling the door -- Child Class");
    }

    @Override
    public void open() {
        System.out.println("Opening the door -- Child Class");
    }

    @Override
    public void close() {
        System.out.println("Closing the door -- Child Class");
    }

    public void knock() {
        System.out.println("Knocking on the door -- Extra Method in Child Class");
    }
}
