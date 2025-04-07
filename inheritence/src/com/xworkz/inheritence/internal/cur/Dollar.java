package com.xworkz.inheritence.internal.cur;

public class Dollar extends Currency {

    @Override
    public void value() {
        System.out.println("Running value in Dollar");
    }

    @Override
    public void rate() {
        System.out.println("Running rate in Dollar");
    }

    @Override
    public void symbol() {
        System.out.println("Running symbol in Dollar");
    }

    @Override
    public void usage() {
        System.out.println("Running usage in Dollar");
    }

    public void country() {
        System.out.println("Dollar currency is used in USA");
    }
}
