package com.xworkz.inheritence.internal.drink;

public class Drink {
    public Drink() {
        System.out.println("Running non-arg constructor Drink--parent");
    }

    public void sip() {
        System.out.println("Drink can be sipped--parent");
    }

    public void refresh() {
        System.out.println("Drink refreshes--parent");
    }

    public void cold() {
        System.out.println("Drink is often cold--parent");
    }

    public void sweet() {
        System.out.println("Drink can be sweet--parent");
    }

    public void healthy() {
        System.out.println("Drink can be healthy--parent");
    }
}
