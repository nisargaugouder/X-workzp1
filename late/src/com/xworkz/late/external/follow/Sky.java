package com.xworkz.late.external.follow;

import com.xworkz.late.internal.moon.Moon;

public class Sky {
    private Moon moon;

    public Sky(Moon moon) {
        this.moon = moon;
    }

    public void shine() {
        System.out.println("Running shine in Sky");
        if (this.moon != null) {
            this.moon.reflectLight();
        } else {
            System.out.println("error");
        }
    }
}
