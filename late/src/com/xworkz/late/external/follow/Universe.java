package com.xworkz.late.external.follow;

import com.xworkz.late.internal.earth.Earth;

public class Universe {
    private Earth earth;

    public Universe(Earth earth) {
        this.earth = earth;
    }

    public void observe() {
        System.out.println("Running observe in Universe");
        if (this.earth != null) {
            this.earth.supportLife();
        } else {
            System.out.println("error");
        }
    }
}
