package com.xworkz.late.internal.hm;

public class HMShirtImpl implements HM {
    public HMShirtImpl() {
        System.out.println("no-arg const HMShirtImpl");
    }

    @Override
    public void wear() {
        System.out.println("Wearing HMShirtImpl");
    }
}
