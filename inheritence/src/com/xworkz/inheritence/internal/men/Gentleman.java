package com.xworkz.inheritence.internal.men;

public class Gentleman extends Men {
    public Gentleman() {
        super();
        System.out.println("Gentleman --child");
    }

    @Override
    public void work() {
        System.out.println("Gentleman works with dedication --child");
    }

    @Override
    public void lead() {
        System.out.println("Gentleman leads with wisdom --child");
    }

    @Override
    public void dress() {
        System.out.println("Gentleman dresses with style --child");
    }

    @Override
    public void fit() {
        System.out.println("Gentleman maintains good health --child");
    }

    @Override
    public void social() {
        System.out.println("Gentleman socializes politely --child");
    }
}
