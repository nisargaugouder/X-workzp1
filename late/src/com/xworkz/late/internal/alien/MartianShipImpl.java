package com.xworkz.late.internal.alien;

public class MartianShipImpl implements Spaceship {
    public MartianShipImpl(){
        System.out.println("no arg cons of MartianShipImpl");
    }

    @Override
    public void travel() {
        System.out.println("Martian ship traveling through galaxy");
    }
}
