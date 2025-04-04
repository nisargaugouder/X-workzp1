package com.xworkz.inheritence.internal.charger;

public class Wire extends Charger {
    public Wire() {
        super();
        System.out.println("Running non-arg constructor Wire--child");
    }
    @Override
    public void cPin() {
        System.out.println("Wire has a C-type pin--child");
    }
    @Override
    public void phone() {
        System.out.println("Wire is used to charge phones--child");
    }
    @Override
    public void plug() {
        System.out.println("Wire needs to be plugged in--child");
    }
    @Override
    public void small() {
        System.out.println("Wire is small and portable--child");
    }
    @Override
    public void white() {
        System.out.println("Wire is mostly white in color--child");
    }
}
