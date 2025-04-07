package com.xworkz.inheritence.internal.drink;

public class Juice extends Drink {

    @Override
    public void sip() {
        System.out.println("Running sip in Juice");
    }

    @Override
    public void refresh() {
        System.out.println("Running refresh in Juice");
    }

    @Override
    public void cold() {
        System.out.println("Running cold in Juice");
    }

    @Override
    public void sweet() {
        System.out.println("Running sweet in Juice");
    }

    @Override
    public void healthy() {
        System.out.println("Running healthy in Juice");
    }

    public void flavor() {
        System.out.println("Juice has different flavors");
    }
}
