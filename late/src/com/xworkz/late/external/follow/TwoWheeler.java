package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bike.Bike;

public class TwoWheeler {
    private Bike bike;

    public TwoWheeler(Bike bike) {
        this.bike = bike;
    }

    public void start() {
        System.out.println("Running start in TwoWheeler");
        if (this.bike != null) {
            this.bike.ride();
        } else {
            System.out.println("Error: bike is null");
        }
    }
}
