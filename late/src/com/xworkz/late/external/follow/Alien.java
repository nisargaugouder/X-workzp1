package com.xworkz.late.external.follow;

import com.xworkz.late.internal.alien.Spaceship;

public class Alien {
    private Spaceship ship;

    public Alien(Spaceship ship) {
        this.ship = ship;
    }

    public void invade() {
        System.out.println("Alien preparing invasion");
        if (this.ship!=null){
            this.ship.travel();
        }
        else {
            System.out.println("err");
        }
    }
}
