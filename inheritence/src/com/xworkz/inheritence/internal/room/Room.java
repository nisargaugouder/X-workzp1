package com.xworkz.inheritence.internal.room;

public class Room {
    public Room() {
        System.out.println("Running non-arg constructor Room");
    }
    public void enter() {
        System.out.println("Entering the room");
    }
    public void decorate() {
        System.out.println("Room is decorated");
    }
    public void clean() {
        System.out.println("Room is cleaned");
    }
    public void ventilate() {
        System.out.println("Room has ventilation");
    }
}
