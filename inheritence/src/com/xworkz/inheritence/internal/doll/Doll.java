package com.xworkz.inheritence.internal.doll;

public class Doll {
    public Doll() {
        System.out.println("Running non-arg constructor Doll--parent");
    }

    public void play() {
        System.out.println("Doll can be played with--parent");
    }

    public void dress() {
        System.out.println("Doll can be dressed up--parent");
    }

    public void talk() {
        System.out.println("Doll can talk--parent");
    }

    public void move() {
        System.out.println("Doll can move--parent");
    }

    public void collect() {
        System.out.println("Doll is collectible--parent");
    }
}
