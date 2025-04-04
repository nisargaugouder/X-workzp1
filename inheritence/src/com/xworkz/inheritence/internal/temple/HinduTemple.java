package com.xworkz.inheritence.internal.temple;

public class HinduTemple extends Temple {
    public HinduTemple() {
        super();
        System.out.println("HinduTemple --child");
    }

    @Override
    public void worship() {
        System.out.println("Hindus worship various deities --child");
    }

    @Override
    public void meditate() {
        System.out.println("HinduTemple is a serene place for meditation --child");
    }

    @Override
    public void lightLamp() {
        System.out.println("Oil lamps are lit as an offering --child");
    }

    @Override
    public void offerPrayers() {
        System.out.println("Mantras and prayers are chanted --child");
    }

    @Override
    public void ringBell() {
        System.out.println("Ringing the bell signifies the beginning of prayer --child");
    }
}
