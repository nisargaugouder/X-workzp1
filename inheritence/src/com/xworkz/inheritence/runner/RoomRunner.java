package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.room.Room;
import com.xworkz.inheritence.internal.room.Bedroom;

public class RoomRunner {
    public static void main(String[] args) {
        Room room = new Bedroom();
        room.enter();
        room.decorate();
        room.clean();
        room.ventilate();

        System.out.println("-----------------");
        Bedroom bedroom = new Bedroom();
        bedroom.enter();
        bedroom.decorate();
        bedroom.clean();
        bedroom.ventilate();
    }
}
