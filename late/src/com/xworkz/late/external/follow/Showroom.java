package com.xworkz.late.external.follow;

import com.xworkz.late.internal.hm.HM;

public class Showroom {
    private HM hm;

    public Showroom(HM hm) {
        this.hm = hm;
    }

    public void tryDress() {
        System.out.println("Running tryDress in Showroom");
        if (this.hm != null) {
            this.hm.wear();
        } else {
            System.out.println("error");
        }
    }
}
