package com.xworkz.inheritence.internal.charger;

public class Wire extends Charger {

    public Wire() {
        super();
        System.out.println("Running no-arg constructor of Wire -- Child Class");
    }

    @Override
    public void cPin() {
        System.out.println("Type-C Pin of Wire -- Child Class");
    }

    @Override
    public void phone() {
        System.out.println("Phone Charging through Wire -- Child Class");
    }

    @Override
    public void plug() {
        System.out.println("Plugging Wire -- Child Class");
    }

    @Override
    public void small() {
        System.out.println("Wire is Small in Size -- Child Class");
    }

    @Override
    public void white() {
        System.out.println("Wire is White in Color -- Child Class");
    }

    public void connectLaptop() {
        System.out.println("Wire is connecting to Laptop -- Extra Method in Child Class");
    }
}
