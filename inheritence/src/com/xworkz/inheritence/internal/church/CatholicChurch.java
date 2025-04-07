package com.xworkz.inheritence.internal.church;

public class CatholicChurch extends Church {

    public CatholicChurch() {
        super();
        System.out.println("Running non-arg constructor CatholicChurch--child");
    }

    @Override
    public void service() {
        System.out.println("Catholic Church conducts special services--child");
    }

    @Override
    public void pray() {
        System.out.println("People pray with devotion in Catholic Church--child");
    }

    @Override
    public void candles() {
        System.out.println("Candles are important in Catholic Church--child");
    }

    @Override
    public void hymns() {
        System.out.println("Catholic Church sings special hymns--child");
    }

    @Override
    public void bible() {
        System.out.println("Bible is central in Catholic Church--child");
    }

    public void specialEvent() {
        System.out.println("Catholic Church conducts special events--child specific method");
    }
}
