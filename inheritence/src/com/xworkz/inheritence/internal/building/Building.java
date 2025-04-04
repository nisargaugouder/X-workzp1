package com.xworkz.inheritence.internal.building;

public class Building {
    public Building() {
        System.out.println("Running non-arg constructor Building--parent");
    }
    public void shelter() {
        System.out.println("Building provides shelter--parent");
    }
    public void structure() {
        System.out.println("Building has a structure--parent");
    }
    public void floors() {
        System.out.println("Building has floors--parent");
    }
    public void foundation() {
        System.out.println("Building has a foundation--parent");
    }
    public void rooms() {
        System.out.println("Building consists of rooms--parent");
    }
}
