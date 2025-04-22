package com.xworkz.late.internal.carrot;

public class RedCarrotImpl implements Carrot {
    public RedCarrotImpl() {
        System.out.println("no-arg const RedCarrotImpl");
    }

    @Override
    public void eat() {
        System.out.println("eating carrot in RedCarrotImpl");
    }
}
