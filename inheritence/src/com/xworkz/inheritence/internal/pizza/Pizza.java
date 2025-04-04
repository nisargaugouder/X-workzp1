package com.xworkz.inheritence.internal.pizza;

public class Pizza {
    public Pizza() {
        System.out.println("Pizza --parent");
    }

    public void crust() {
        System.out.println("Pizza has a crispy crust --parent");
    }

    public void sauce() {
        System.out.println("Pizza is topped with sauce --parent");
    }

    public void cheese() {
        System.out.println("Pizza includes cheese --parent");
    }

    public void flavors() {
        System.out.println("Pizza comes in different flavors --parent");
    }

    public void cook() {
        System.out.println("Pizza is cooked in an oven --parent");
    }
}
