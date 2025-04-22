package com.xworkz.late.external.follow;

import com.xworkz.late.internal.barbie.Barbie;

public class DollHouse {
    private Barbie barbie;

    public DollHouse(Barbie barbie) {
        this.barbie = barbie;
    }

    public void play() {
        System.out.println("Running play in DollHouse");
        if (this.barbie != null) {
            this.barbie.style();
        } else {
            System.out.println("Error: barbie is null");
        }
    }
}
