package com.xworkz.late.external.follow;

import com.xworkz.late.internal.fan.Fan;

public class RoomFan {
    private Fan fan;

    public RoomFan(Fan fan) {
        this.fan = fan;
    }

    public void start() {
        System.out.println("Running start in RoomFan");
        if (this.fan != null) {
            this.fan.blowAir();
        } else {
            System.out.println("error");
        }
    }
}
