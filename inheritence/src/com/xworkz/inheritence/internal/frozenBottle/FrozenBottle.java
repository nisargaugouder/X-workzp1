package com.xworkz.inheritence.internal.frozenBottle;

public class FrozenBottle {
    public FrozenBottle() {
        System.out.println("FrozenBottle --parent");
    }

    public void freeze() {
        System.out.println("Freezing water --parent");
    }

    public void cold() {
        System.out.println("Keeps water cold --parent");
    }

    public void cool() {
        System.out.println("Used for cooling --parent");
    }

    public void melt() {
        System.out.println("Melts slowly --parent");
    }

    public void carry() {
        System.out.println("Easy to carry --parent");
    }
}
