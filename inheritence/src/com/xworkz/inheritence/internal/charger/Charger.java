package com.xworkz.inheritence.internal.charger;

public class Charger {
    public Charger() {
        System.out.println("Running non-arg constructor Charger--parent");
    }
    public void cPin() {
        System.out.println("Charger has a C-type pin--parent");
    }
    public void phone() {
        System.out.println("Charger is used to charge phones--parent");
    }
    public void plug() {
        System.out.println("Charger needs to be plugged in--parent");
    }
    public void small() {
        System.out.println("Charger is small and portable--parent");
    }
    public void white() {
        System.out.println("Charger is mostly white in color--parent");
    }
}
