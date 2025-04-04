package com.xworkz.inheritence.internal.river;

public class Nile extends River {
    public Nile() {
        super();
        System.out.println("Nile --child");
    }

    @Override
    public void length() {
        System.out.println("Nile is the longest river --child");
    }

    @Override
    public void origin() {
        System.out.println("Nile originates from Africa --child");
    }

    @Override
    public void flows() {
        System.out.println("Nile flows through many countries --child");
    }

    @Override
    public void providesWater() {
        System.out.println("Nile is a major water source --child");
    }

    @Override
    public void wildlife() {
        System.out.println("Nile supports diverse wildlife --child");
    }
}
