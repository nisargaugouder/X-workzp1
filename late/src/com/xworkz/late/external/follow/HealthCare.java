package com.xworkz.late.external.follow;

import com.xworkz.late.internal.hospital.Hospital;

public class HealthCare {
    private Hospital hospital;

    public HealthCare(Hospital hospital) {
        this.hospital = hospital;
    }

    public void cure() {
        System.out.println("Running cure in HealthCare");
        if (this.hospital != null) {
            this.hospital.treat();
        } else {
            System.out.println("error");
        }
    }
}
