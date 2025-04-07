package com.xworkz.inheritence.internal.city;

public class NewYork extends City {

    public NewYork() {
        super();
        System.out.println("Running non-arg constructor NewYork--child");
    }

    @Override
    public void people() {
        System.out.println("New York has diverse people--child");
    }

    @Override
    public void roads() {
        System.out.println("New York has busy roads--child");
    }

    @Override
    public void visit() {
        System.out.println("Tourists visit New York--child");
    }

    @Override
    public void life() {
        System.out.println("New York life is fast--child");
    }

    @Override
    public void business() {
        System.out.println("New York is a business hub--child");
    }

    public void statueOfLiberty() {
        System.out.println("Statue of Liberty is in New York--child specific method");
    }
}
