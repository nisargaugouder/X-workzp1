package com.xworkz.late.internal.door;

public class WoodenDoorImpl implements Door {
    public WoodenDoorImpl() {
        System.out.println("no-arg const WoodenDoorImpl");
    }

    @Override
    public void open() {
        System.out.println("opening wooden door in WoodenDoorImpl");
    }
}
