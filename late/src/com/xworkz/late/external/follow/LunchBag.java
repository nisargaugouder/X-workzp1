package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bottle.Bottle;

public class LunchBag {
    private Bottle bottle;

    public LunchBag(Bottle bottle) {
        this.bottle = bottle;
    }

    public void carry() {
        System.out.println("Running carry in LunchBag");
        if (this.bottle != null) {
            this.bottle.fill();
        } else {
            System.out.println("Error: bottle is null");
        }
    }
}
