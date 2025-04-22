package com.xworkz.late.internal.gold;

public class GoldRingImpl implements Gold {
    public GoldRingImpl() {
        System.out.println("no-arg const GoldRingImpl");
    }

    @Override
    public void shine() {
        System.out.println("GoldRingImpl is shining");
    }
}
