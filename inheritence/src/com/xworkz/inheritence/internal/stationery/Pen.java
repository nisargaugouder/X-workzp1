package com.xworkz.inheritence.internal.stationery;

public class Pen extends Stationery {
    public Pen() {
        super();
        System.out.println("Pen --child");
    }

    @Override
    public void write() {
        System.out.println("A pen is used to write permanently --child");
    }

    @Override
    public void erase() {
        System.out.println("Some pens have erasable ink --child");
    }

    @Override
    public void color() {
        System.out.println("Pens come in blue, black, and red colors --child");
    }

    @Override
    public void size() {
        System.out.println("Pens are available in different sizes --child");
    }

    @Override
    public void price() {
        System.out.println("Pens range from cheap to expensive --child");
    }
}
