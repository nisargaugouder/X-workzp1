package com.xworkz.inheritence.internal.towel;

public class Towel {
    public Towel() {
        System.out.println("Towel --parent");
    }

    public void absorb() {
        System.out.println("Towel absorbs water --parent");
    }

    public void material() {
        System.out.println("Towel is made of cotton --parent");
    }

    public void size() {
        System.out.println("Towel comes in different sizes --parent");
    }

    public void use() {
        System.out.println("Towel is used in bathrooms --parent");
    }

    public void wash() {
        System.out.println("Towel requires regular washing --parent");
    }
}
