package com.xworkz.inheritence.internal.earpods;

public class Earpods {
    public Earpods() {
        System.out.println("Earpods created --parent");
    }

    public void play() {
        System.out.println("Playing music --parent");
    }

    public void charge() {
        System.out.println("Charging --parent");
    }

    public void connect() {
        System.out.println("Connecting to device --parent");
    }

    public void noiseCancel() {
        System.out.println("Noise cancellation enabled --parent");
    }

    public void touchControl() {
        System.out.println("Touch controls activated --parent");
    }
}
