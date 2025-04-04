package com.xworkz.inheritence.internal.lock;

public class Lock extends Key {
    public Lock() {
        super();
        System.out.println("Lock --child");
    }

    @Override
    public void big() {
        System.out.println("Lock is big --child");
    }

    @Override
    public void close() {
        System.out.println("Lock can close --child");
    }

    @Override
    public void open() {
        System.out.println("Lock can open --child");
    }

    @Override
    public void white() {
        System.out.println("Lock is white --child");
    }

    @Override
    public void small() {
        System.out.println("Lock is small --child");
    }
}
