package com.xworkz.inheritence.internal.room;

public class Bedroom extends Room {
    public Bedroom() {
        super();
        System.out.println("Bedroom --child");
    }

    @Override
    public void enter() {
        System.out.println("Entering the bedroom --child");
    }

    @Override
    public void decorate() {
        System.out.println("Decorating the bedroom --child");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the bedroom --child");
    }

    @Override
    public void ventilate() {
        System.out.println("Ventilating the bedroom --child");
    }

    @Override
    public void lightUp() {
        System.out.println("Lighting up the bedroom --child");
    }
}
