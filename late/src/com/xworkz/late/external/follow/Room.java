package com.xworkz.late.external.follow;

import com.xworkz.late.internal.door.Door;

public class Room {
    private Door door;

    public Room(Door door) {
        this.door = door;
    }

    public void enter() {
        System.out.println("running enter in Room");
        if (this.door != null) {
            this.door.open();
        } else {
            System.out.println("error");
        }
    }
}
