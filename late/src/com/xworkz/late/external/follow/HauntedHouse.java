package com.xworkz.late.external.follow;

import com.xworkz.late.internal.dead.Dead;

public class HauntedHouse {
    private Dead dead;

    public HauntedHouse(Dead dead) {
        this.dead = dead;
    }

    public void appear() {
        System.out.println("running appear in HauntedHouse");
        if (this.dead != null) {
            this.dead.silent();
        } else {
            System.out.println("error");
        }
    }
}
