package com.xworkz.inheritence.internal.furniture;

public class Furniture {
    public Furniture() {
        System.out.println("Furniture --parent");
    }

    public void support() {
        System.out.println("Furniture provides support --parent");
    }

    public void material() {
        System.out.println("Furniture is made of different materials --parent");
    }

    public void weight() {
        System.out.println("Furniture has different weights --parent");
    }

    public void move() {
        System.out.println("Some furniture is movable --parent");
    }

    public void design() {
        System.out.println("Furniture has various designs --parent");
    }
}
