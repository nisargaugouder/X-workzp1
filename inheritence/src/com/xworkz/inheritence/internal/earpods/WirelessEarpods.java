package com.xworkz.inheritence.internal.earpods;

public class WirelessEarpods extends Earpods {
    public WirelessEarpods() {
        super();
        System.out.println("WirelessEarpods created --child");
    }

    @Override
    public void play() {
        System.out.println("Playing wirelessly --child");
    }

    @Override
    public void charge() {
        System.out.println("Charging wirelessly --child");
    }

    @Override
    public void connect() {
        System.out.println("Connecting via Bluetooth --child");
    }

    @Override
    public void noiseCancel() {
        System.out.println("Advanced noise cancellation --child");
    }

    @Override
    public void touchControl() {
        System.out.println("Smart touch controls --child");
    }
}
