package com.xworkz.late.external.follow;

import com.xworkz.late.internal.plane.Jet;

public class Airoplain {
    private Jet jet;

    public Airoplain(Jet jet) {
        this.jet = jet;
    }

    public void liftOff() {
        System.out.println("Airoplain preparing for takeoff");
        if(this.jet!=null){
            this.jet.fly();
        }
        else {
            System.out.println("err");
        }
    }
}