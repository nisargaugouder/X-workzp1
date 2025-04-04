package com.xworkz.inheritence.internal.shoe;

public class Shoe {
    public Shoe() {
        System.out.println("Shoe --parent");
    }

    public void protect() {
        System.out.println("Shoes protect feet --parent");
    }

    public void comfort() {
        System.out.println("Shoes provide comfort --parent");
    }

    public void style() {
        System.out.println("Shoes come in various styles --parent");
    }

    public void material() {
        System.out.println("Shoes are made from different materials --parent");
    }

    public void size() {
        System.out.println("Shoes are available in different sizes --parent");
    }
}
