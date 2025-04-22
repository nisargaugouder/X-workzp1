package com.xworkz.late.external.follow;

import com.xworkz.late.internal.doctor.Doctor;

public class Hospital {
    private Doctor doctor;

    public Hospital(Doctor doctor) {
        this.doctor = doctor;
    }

    public void admit() {
        System.out.println("running admit in Hospital");
        if (this.doctor != null) {
            this.doctor.treat();
        } else {
            System.out.println("error");
        }
    }
}
