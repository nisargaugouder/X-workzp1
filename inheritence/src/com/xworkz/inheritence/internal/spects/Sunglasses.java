package com.xworkz.inheritence.internal.spects;

public class Sunglasses extends Spects {
    public Sunglasses() {
        super();
        System.out.println("Sunglasses --child");
    }

    @Override
    public void vision() {
        System.out.println("Sunglasses provide shade and reduce glare --child");
    }

    @Override
    public void lenses() {
        System.out.println("Sunglasses have UV-protected lenses --child");
    }

    @Override
    public void frame() {
        System.out.println("Sunglasses come in stylish frames --child");
    }

    @Override
    public void protect() {
        System.out.println("Sunglasses protect eyes from sunlight --child");
    }

    @Override
    public void customize() {
        System.out.println("Sunglasses can be customized for different tints --child");
    }
}
