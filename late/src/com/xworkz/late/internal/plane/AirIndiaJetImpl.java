package com.xworkz.late.internal.plane;

public class AirIndiaJetImpl implements Jet {
    public AirIndiaJetImpl(){
        System.out.println("no-arg const AirIndiaJetImpl");
    }

    @Override
    public void fly() {
        System.out.println("Flying with Air India Jet");
    }
}
