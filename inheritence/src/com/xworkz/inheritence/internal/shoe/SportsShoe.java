package com.xworkz.inheritence.internal.shoe;

public class SportsShoe extends Shoe {
    public SportsShoe() {
        super();
        System.out.println("SportsShoe --child");
    }

    @Override
    public void protect() {
        System.out.println("Sports shoes offer extra protection --child");
    }

    @Override
    public void comfort() {
        System.out.println("Sports shoes provide better comfort --child");
    }

    @Override
    public void style() {
        System.out.println("Sports shoes have athletic designs --child");
    }

    @Override
    public void material() {
        System.out.println("Sports shoes use breathable materials --child");
    }

    @Override
    public void size() {
        System.out.println("Sports shoes come in various sizes --child");
    }
}
