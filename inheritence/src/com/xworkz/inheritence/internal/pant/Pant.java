package com.xworkz.inheritence.internal.pant;

public class Pant {
    public Pant() {
        System.out.println("Pant --parent");
    }

    public void wear() {
        System.out.println("Pant is worn for covering legs --parent");
    }

    public void fabric() {
        System.out.println("Pant is made of different fabrics --parent");
    }

    public void style() {
        System.out.println("Pant is available in different styles --parent");
    }

    public void comfort() {
        System.out.println("Pant provides comfort --parent");
    }

    public void size() {
        System.out.println("Pant comes in various sizes --parent");
    }
}
