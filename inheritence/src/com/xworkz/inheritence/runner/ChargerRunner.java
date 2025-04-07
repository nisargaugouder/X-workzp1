package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.charger.Charger;
import com.xworkz.inheritence.internal.charger.Wire;
import com.xworkz.inheritence.internal.charger.Electrician;

public class ChargerRunner {
    public static void main(String[] args) {
        System.out.println("---------- Parent Object ----------");
        Charger charger1 = new Charger();
        charger1.cPin();
        charger1.phone();
        charger1.plug();
        charger1.small();
        charger1.white();

        System.out.println("---------- Upcasting ----------");
        Charger charger = new Wire();
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();


        System.out.println("---------- Direct Child Object ----------");
        Wire wire = new Wire();
        wire.cPin();
        wire.phone();
        wire.plug();
        wire.small();
        wire.white();
        wire.connectLaptop();

        System.out.println("---------- Electrician Class Calling ----------");
        Electrician electrician = new Electrician();
        electrician.checkConnection(charger);
        electrician.checkConnection(charger1);
        electrician.checkConnection(wire);
    }
}
