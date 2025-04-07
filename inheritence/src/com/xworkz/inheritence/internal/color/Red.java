package com.xworkz.inheritence.internal.color;

public class Red extends Color {

    @Override
    public void display() {
        System.out.println("Running display in Red");
    }

    @Override
    public void mix() {
        System.out.println("Running mix in Red");
    }

    @Override
    public void brighten() {
        System.out.println("Running brighten in Red");
    }

    @Override
    public void fade() {
        System.out.println("Running fade in Red");
    }

    public void shade() {
        System.out.println("Running shade in Red");
    }
}
