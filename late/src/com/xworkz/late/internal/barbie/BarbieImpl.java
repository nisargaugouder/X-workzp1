package com.xworkz.late.internal.barbie;

public class BarbieImpl implements Barbie {
    public BarbieImpl() {
        System.out.println("no-arg constructor of BarbieImpl");
    }

    @Override
    public void style() {
        System.out.println("Styling the Barbie doll");
    }
}
