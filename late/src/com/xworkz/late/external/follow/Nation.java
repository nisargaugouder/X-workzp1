package com.xworkz.late.external.follow;

import com.xworkz.late.internal.modhi.Modhi;

public class Nation {
    private Modhi modhi;

    public Nation(Modhi modhi) {
        this.modhi = modhi;
    }

    public void develop() {
        System.out.println("Running develop in Nation");
        if (this.modhi != null) {
            this.modhi.lead();
        } else {
            System.out.println("error");
        }
    }
}
