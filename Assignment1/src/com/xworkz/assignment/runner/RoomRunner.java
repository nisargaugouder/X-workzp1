package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.room.Room;

public class RoomRunner {
    public static void main(String[] args) {
        Room room = new Room("Bedroom", 200.5, true);
        System.out.println(room);
        System.out.println(room.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(room));
    }
}
