package com.xworkz.inheritence.internal.stationery;

public class Stationery {
    public Stationery() {
        System.out.println("Stationery --parent");
    }

    public void write() {
        System.out.println("Stationery is used for writing --parent");
    }

    public void erase() {
        System.out.println("Some stationery items can erase --parent");
    }

    public void color() {
        System.out.println("Stationery comes in various colors --parent");
    }

    public void size() {
        System.out.println("Stationery items have different sizes --parent");
    }

    public void price() {
        System.out.println("Stationery items have different prices --parent");
    }
}
