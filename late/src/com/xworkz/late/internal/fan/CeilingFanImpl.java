package com.xworkz.late.internal.fan;

public class CeilingFanImpl implements Fan {
    public CeilingFanImpl() {
        System.out.println("no-arg const CeilingFanImpl");
    }

    @Override
    public void blowAir() {
        System.out.println("CeilingFanImpl blowing air");
    }
}
