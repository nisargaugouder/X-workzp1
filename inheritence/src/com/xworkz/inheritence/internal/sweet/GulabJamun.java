package com.xworkz.inheritence.internal.sweet;

public class GulabJamun extends Sweet {
    public GulabJamun() {
        super();
        System.out.println("GulabJamun --child");
    }

    @Override
    public void taste() {
        System.out.println("GulabJamun tastes soft and juicy --child");
    }

    @Override
    public void sugar() {
        System.out.println("GulabJamun is dipped in sugar syrup --child");
    }

    @Override
    public void festival() {
        System.out.println("GulabJamun is a popular sweet for celebrations --child");
    }

    @Override
    public void store() {
        System.out.println("GulabJamun can be stored in a refrigerator --child");
    }

    @Override
    public void gift() {
        System.out.println("GulabJamun is a favorite gift sweet --child");
    }
}
