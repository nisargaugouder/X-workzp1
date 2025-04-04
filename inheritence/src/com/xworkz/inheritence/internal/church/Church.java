package com.xworkz.inheritence.internal.church;

public class Church {
    public Church() {
        System.out.println("Running non-arg constructor Church--parent");
    }

    public void service() {
        System.out.println("Church holds service--parent");
    }

    public void pray() {
        System.out.println("People pray in church--parent");
    }

    public void candles() {
        System.out.println("Candles are lit in church--parent");
    }

    public void hymns() {
        System.out.println("Churchgoers sing hymns--parent");
    }

    public void bible() {
        System.out.println("Bible is read in church--parent");
    }
}
