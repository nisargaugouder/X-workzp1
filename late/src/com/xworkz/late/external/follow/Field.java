package com.xworkz.late.external.follow;

import com.xworkz.late.internal.sunflower.Sunflower;

public class Field {
    private Sunflower sunflower;

    public Field(Sunflower sunflower) {
        this.sunflower = sunflower;
    }

    public void bloom() {
        System.out.println("Running bloom in Field");
        if (this.sunflower != null) {
            this.sunflower.faceSun();
        } else {
            System.out.println("error");
        }
    }
}
