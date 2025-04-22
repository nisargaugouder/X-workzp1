package com.xworkz.late.external.follow;

import com.xworkz.late.internal.medical.Medical;

public class Clinic {
    private Medical medical;

    public Clinic(Medical medical) {
        this.medical = medical;
    }

    public void treat() {
        System.out.println("Running treat in Clinic");
        if (this.medical != null) {
            this.medical.heal();
        } else {
            System.out.println("error");
        }
    }
}
