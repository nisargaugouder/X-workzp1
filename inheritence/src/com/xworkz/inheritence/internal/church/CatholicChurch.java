package com.xworkz.inheritence.internal.church;

public class CatholicChurch extends Church {
    public CatholicChurch() {
        super();
        System.out.println("Running non-arg constructor CatholicChurch--child");
    }

    @Override
    public void service() {
        System.out.println("Church holds service--child");
    }

    @Override
    public void pray() {
        System.out.println("People pray in church--child");
    }

    @Override
    public void candles() {
        System.out.println("Candles are lit in church--child");
    }

    @Override
    public void hymns() {
        System.out.println("Churchgoers sing hymns--child");
    }

    @Override
    public void bible() {
        System.out.println("Bible is read in church--child");
    }
}
