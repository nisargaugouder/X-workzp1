package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.charger.Charger;
import com.xworkz.inheritence.internal.charger.Wire;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger1 = new Charger();
        charger1.cPin();
        charger1.phone();
        charger1.plug();
        charger1.small();
        charger1.white();

        System.out.println("-------------------");
        Charger charger = new Wire();
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();

        System.out.println("-----------------");
        Wire wire = new Wire();
        wire.cPin();
        wire.phone();
        wire.plug();
        wire.small();
        wire.white();
    }
}
