package com.xworkz.inheritence.internal.dress;

public class Dress {
    public Dress() {
        System.out.println("Running non-arg constructor Dress--parent");
    }

    public void wear() {
        System.out.println("Dress is worn--parent");
    }

    public void style() {
        System.out.println("Dress has different styles--parent");
    }

    public void gender() {
        System.out.println("Dress is for all genders--parent");
    }

    public void comfort() {
        System.out.println("Dress provides comfort--parent");
    }

    public void material() {
        System.out.println("Dress is made of various materials--parent");
    }
}
