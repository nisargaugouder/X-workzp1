package com.xworkz.inheritence.internal.color;

public class Red extends Color {
    public Red() {
        super();
        System.out.println("Running non-arg constructor Red--child");
    }

    @Override
    public void display() {
        System.out.println("Red is a strong color--child");
    }

    @Override
    public void mix() {
        System.out.println("Red mixes with yellow to make orange--child");
    }

    @Override
    public void brighten() {
        System.out.println("Red appears brighter with more intensity--child");
    }

    @Override
    public void fade() {
        System.out.println("Red fades in sunlight--child");
    }
}
