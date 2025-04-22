package com.xworkz.late.external.follow;

import com.xworkz.late.internal.fool.Fool;

public class Circus {
    private Fool fool;

    public Circus(Fool fool) {
        this.fool = fool;
    }

    public void perform() {
        System.out.println("Running perform in Circus");
        if (this.fool != null) {
            this.fool.laugh();
        } else {
            System.out.println("error");
        }
    }
}
