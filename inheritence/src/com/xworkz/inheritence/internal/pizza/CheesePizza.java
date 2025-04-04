package com.xworkz.inheritence.internal.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super();
        System.out.println("CheesePizza --child");
    }

    @Override
    public void crust() {
        System.out.println("CheesePizza has a soft crust --child");
    }

    @Override
    public void sauce() {
        System.out.println("CheesePizza has extra tomato sauce --child");
    }

    @Override
    public void cheese() {
        System.out.println("CheesePizza has a double cheese layer --child");
    }

    @Override
    public void flavors() {
        System.out.println("CheesePizza is available in spicy flavors --child");
    }

    @Override
    public void cook() {
        System.out.println("CheesePizza is baked at high temperature --child");
    }
}
