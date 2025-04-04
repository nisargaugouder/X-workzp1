package com.xworkz.inheritence.internal.trolley;

public class Trolley {
    public Trolley() {
        System.out.println("Trolley --parent");
    }

    public void carry() {
        System.out.println("Trolley is used for carrying items --parent");
    }

    public void wheels() {
        System.out.println("Trolley has wheels --parent");
    }

    public void material() {
        System.out.println("Trolley is made of metal or plastic --parent");
    }

    public void size() {
        System.out.println("Trolley is available in different sizes --parent");
    }

    public void use() {
        System.out.println("Trolley is commonly used in supermarkets --parent");
    }
}
