package com.xworkz.late.external.follow;

import com.xworkz.late.internal.ac.AcRemote;

public class AirConditioner {
    private AcRemote remote;

    public AirConditioner(AcRemote remote) {
        this.remote = remote;
    }

    public void turnOn() {
        System.out.println("Turning on Air Conditioner");
        if(this.remote!=null){
            this.remote.cool();
        }
        else {
            System.out.println("error");
        }
    }
}
