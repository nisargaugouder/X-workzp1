package com.xworkz.inheritence.internal.ocean;

public class Pacific extends Ocean {
    public Pacific() {
        super();
        System.out.println("Pacific --child");
    }

    @Override
    public void depth() {
        System.out.println("Pacific is the deepest ocean --child");
    }

    @Override
    public void marineLife() {
        System.out.println("Pacific has the richest marine life --child");
    }

    @Override
    public void waves() {
        System.out.println("Pacific has massive waves --child");
    }

    @Override
    public void temperature() {
        System.out.println("Pacific has warm and cold currents --child");
    }

    @Override
    public void tides() {
        System.out.println("Pacific has strong tidal patterns --child");
    }
}
