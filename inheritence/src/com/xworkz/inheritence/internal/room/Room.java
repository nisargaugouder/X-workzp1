package com.xworkz.inheritence.internal.room;

public class Room {
    public Room() {
        System.out.println("Room --parent");
    }

    public void enter() {
        System.out.println("Entering the room --parent");
    }

    public void decorate() {
        System.out.println("Decorating the room --parent");
    }

    public void clean() {
        System.out.println("Cleaning the room --parent");
    }

    public void ventilate() {
        System.out.println("Ventilating the room --parent");
    }

    public void lightUp() {
        System.out.println("Lighting up the room --parent");
    }
}
