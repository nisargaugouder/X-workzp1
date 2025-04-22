package com.xworkz.late.internal.bike;

public class KTMbikeImpl implements Bike {
    public KTMbikeImpl() {
        System.out.println("no-arg constructor of KTMbikeImpl");
    }

    @Override
    public void ride() {
        System.out.println("Riding a KTM bike fast");
    }
}
