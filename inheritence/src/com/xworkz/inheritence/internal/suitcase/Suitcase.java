package com.xworkz.inheritence.internal.suitcase;

public class Suitcase {
    public Suitcase() {
        System.out.println("Suitcase --parent");
    }

    public void open() {
        System.out.println("Suitcase can be opened --parent");
    }

    public void close() {
        System.out.println("Suitcase can be closed --parent");
    }

    public void color() {
        System.out.println("Suitcase comes in different colors --parent");
    }

    public void size() {
        System.out.println("Suitcase is available in various sizes --parent");
    }

    public void lock() {
        System.out.println("Suitcase has a locking mechanism --parent");
    }
}
