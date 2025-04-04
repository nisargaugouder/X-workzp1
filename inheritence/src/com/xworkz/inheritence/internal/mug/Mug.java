package com.xworkz.inheritence.internal.mug;

public class Mug {
    public Mug() {
        System.out.println("Mug --parent");
    }

    public void drink() {
        System.out.println("Mug is used for drinking --parent");
    }

    public void material() {
        System.out.println("Mug is made of ceramic --parent");
    }

    public void handle() {
        System.out.println("Mug has a handle --parent");
    }

    public void design() {
        System.out.println("Mug comes in various designs --parent");
    }

    public void hot() {
        System.out.println("Mug can hold hot liquids --parent");
    }
}
