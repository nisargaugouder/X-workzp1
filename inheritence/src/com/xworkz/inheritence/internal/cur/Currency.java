package com.xworkz.inheritence.internal.cur;

public class Currency {
    public Currency() {
        System.out.println("Running non-arg constructor Currency--parent");
    }

    public void value() {
        System.out.println("Currency has a monetary value--parent");
    }

    public void rate() {
        System.out.println("Currency has an exchange rate--parent");
    }

    public void symbol() {
        System.out.println("Each currency has a symbol--parent");
    }

    public void usage() {
        System.out.println("Currency is used for trade--parent");
    }
}
