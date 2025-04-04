package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.room.Room;
import com.xworkz.inheritence.internal.room.Bedroom;

public class RoomRunner {
    public static void main(String[] args) {
        Room room = new Room();
        room.enter();
        room.decorate();
        room.clean();
        room.ventilate();
        room.lightUp();

        System.out.println("-----------");

        Room room2 = new Bedroom();
        room2.enter();
        room2.decorate();
        room2.clean();
        room2.ventilate();
        room2.lightUp();

        System.out.println("-----------");

        Bedroom bedroom = new Bedroom();
        bedroom.enter();
        bedroom.decorate();
        bedroom.clean();
        bedroom.ventilate();
        bedroom.lightUp();
    }
}
