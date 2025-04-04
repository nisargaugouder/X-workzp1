package com.xworkz.inheritence.internal.potato;

public class SweetPotato extends Potato {
    public SweetPotato() {
        super();
        System.out.println("SweetPotato --child");
    }

    @Override
    public void grow() {
        System.out.println("Sweet potatoes grow underground --child");
    }

    @Override
    public void cook() {
        System.out.println("Sweet potatoes are used in desserts and dishes --child");
    }

    @Override
    public void carbs() {
        System.out.println("Sweet potatoes have natural sweetness --child");
    }

    @Override
    public void types() {
        System.out.println("Sweet potatoes have orange, purple, and white varieties --child");
    }

    @Override
    public void staple() {
        System.out.println("Sweet potatoes are a healthy staple food --child");
    }
}
