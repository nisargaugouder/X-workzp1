package com.xworkz.inheritence.internal.lock;

public class Key {
    public Key() {
        System.out.println("Key --parent");
    }

    public void big() {
        System.out.println("Key is big --parent");
    }

    public void close() {
        System.out.println("Key can close --parent");
    }

    public void open() {
        System.out.println("Key can open --parent");
    }

    public void white() {
        System.out.println("Key is white --parent");
    }

    public void small() {
        System.out.println("Key is small --parent");
    }
}
