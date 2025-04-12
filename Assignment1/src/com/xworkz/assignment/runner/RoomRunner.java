package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.room.Room;

public class RoomRunner {
    public static void main(String[] args) {
        Room room = new Room("Bedroom", 200.5, true);
        System.out.println(room);
        System.out.println(room.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(room));

        Room room1 = new Room("Living Room", 300.0, false);
        Room room2 = new Room("Bedroom", 200.5, true);

        boolean same = room1.equals(room2);
        System.out.println("same: " + same);
    }
}
