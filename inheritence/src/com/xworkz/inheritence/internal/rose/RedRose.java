package com.xworkz.inheritence.internal.rose;

public class RedRose extends Rose {
    public RedRose() {
        super();
        System.out.println("RedRose --child");
    }

    @Override
    public void fragrance() {
        System.out.println("RedRose has a strong fragrance --child");
    }

    @Override
    public void colors() {
        System.out.println("RedRose is primarily red --child");
    }

    @Override
    public void decorate() {
        System.out.println("RedRose is widely used for decoration --child");
    }

    @Override
    public void thorns() {
        System.out.println("RedRose has sharp thorns --child");
    }

    @Override
    public void love() {
        System.out.println("RedRose is a symbol of deep love --child");
    }
}
