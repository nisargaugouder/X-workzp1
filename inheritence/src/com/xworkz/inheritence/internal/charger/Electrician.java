package com.xworkz.inheritence.internal.charger;

public class Electrician {

    public void checkConnection(Charger charger) {
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();

        if (charger instanceof Wire) {
            System.out.println("charger instanceof Wire");
            Wire wire = (Wire) charger;
            wire.connectLaptop();
        }
    }
}
