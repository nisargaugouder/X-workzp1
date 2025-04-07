package com.xworkz.inheritence.internal.earpods;

public class Case {

    public void carry(Earpods earpods) {
        earpods.play();
        earpods.charge();
        earpods.connect();
        earpods.noiseCancel();
        earpods.touchControl();

        if(earpods instanceof WirelessEarpods) {
            System.out.println("earpods is instance of WirelessEarpods");
            WirelessEarpods wireless = (WirelessEarpods) earpods;
            wireless.bluetoothVersion();
        }
    }
}
