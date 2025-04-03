package com.xworkz.inheritence.internal.cur;

public class Currency {
    public Currency() {
        System.out.println("Running non-arg constructor of Currency");
    }
    public void value() {
        System.out.println("Currency has monetary value");
    }
    public void exchangeRate() {
        System.out.println("Currency has an exchange rate");
    }
    public void symbol() {
        System.out.println("Currency has a unique symbol");
    }
    public void usage() {
        System.out.println("Currency is used for trade and transactions");
    }
}
