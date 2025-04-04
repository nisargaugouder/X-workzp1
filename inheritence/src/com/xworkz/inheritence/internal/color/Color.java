package com.xworkz.inheritence.internal.color;

public class Color {
    public Color() {
        System.out.println("Running non-arg constructor Color--parent");
    }

    public void display() {
        System.out.println("Color is visible--parent");
    }

    public void mix() {
        System.out.println("Colors can mix to form new shades--parent");
    }

    public void brighten() {
        System.out.println("Color can be made brighter--parent");
    }

    public void fade() {
        System.out.println("Color can fade over time--parent");
    }
}
