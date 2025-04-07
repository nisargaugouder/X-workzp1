package com.xworkz.inheritence.internal.earpods;

public class WirelessEarpods extends Earpods {

    @Override
    public void play() {
        System.out.println("Running play in WirelessEarpods");
    }

    @Override
    public void charge() {
        System.out.println("Running charge in WirelessEarpods");
    }

    @Override
    public void connect() {
        System.out.println("Running connect in WirelessEarpods");
    }

    @Override
    public void noiseCancel() {
        System.out.println("Running noiseCancel in WirelessEarpods");
    }

    @Override
    public void touchControl() {
        System.out.println("Running touchControl in WirelessEarpods");
    }

    public void bluetoothVersion() {
        System.out.println("WirelessEarpods support Bluetooth 5.2");
    }
}
