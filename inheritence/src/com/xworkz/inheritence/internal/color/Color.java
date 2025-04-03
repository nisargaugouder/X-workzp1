package com.xworkz.inheritence.internal.color;

public class Color {
    public Color() {
        System.out.println("Running non-arg constructor Color");
    }
    public void display() {
        System.out.println("Displaying a color");
    }
    public void mix() {
        System.out.println("Color is mixing with another color");
    }
    public void brighten() {
        System.out.println("Color is brightening");
    }
    public void fade() {
        System.out.println("Color is fading over time");
    }
}
