package com.xworkz.late.external.follow;

import com.xworkz.late.internal.india.India;

public class Country {
    private India india;

    public Country(India india) {
        this.india = india;
    }

    public void progress() {
        System.out.println("Running progress in Country");
        if (this.india != null) {
            this.india.grow();
        } else {
            System.out.println("error");
        }
    }
}
