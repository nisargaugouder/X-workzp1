package com.xworkz.late.external.follow;

import com.xworkz.late.internal.battery.Battery;

public class Charger {
    private Battery battery;

    public Charger(Battery battery) {
        this.battery = battery;
    }

    public void plug() {
        System.out.println("Running plug in Charger");
        if (this.battery != null) {
            this.battery.charge();
        } else {
            System.out.println("Error: battery is null");
        }
    }
}
