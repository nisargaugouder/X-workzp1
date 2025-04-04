package com.xworkz.inheritence.internal.drink;

public class Juice extends Drink {
    public Juice() {
        super();
        System.out.println("Running non-arg constructor Juice--child");
    }

    @Override
    public void sip() {
        System.out.println("Juice is enjoyed in sips--child");
    }

    @Override
    public void refresh() {
        System.out.println("Juice is refreshing--child");
    }

    @Override
    public void cold() {
        System.out.println("Juice is served cold--child");
    }

    @Override
    public void sweet() {
        System.out.println("Juice is naturally sweet--child");
    }

    @Override
    public void healthy() {
        System.out.println("Juice is full of nutrients--child");
    }
}
