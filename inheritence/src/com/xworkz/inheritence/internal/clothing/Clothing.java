package com.xworkz.inheritence.internal.clothing;

public class Clothing {
    public Clothing() {
        System.out.println("Running non-arg constructor Clothing--parent");
    }

    public void wear() {
        System.out.println("Clothing is worn--parent");
    }

    public void fabric() {
        System.out.println("Clothing has different fabrics--parent");
    }

    public void fit() {
        System.out.println("Clothing comes in various sizes--parent");
    }

    public void label() {
        System.out.println("Clothing has different brands--parent");
    }

    public void style() {
        System.out.println("Clothing has various designs--parent");
    }
}
