package com.xworkz.inheritence.internal.lipstick;

public class Lipstick {
    public Lipstick() {
        System.out.println("Lipstick --parent");
    }

    public void color() {
        System.out.println("Lipstick adds color --parent");
    }

    public void shades() {
        System.out.println("Lipstick comes in different shades --parent");
    }

    public void texture() {
        System.out.println("Lipstick is made of waxes and oils --parent");
    }

    public void beauty() {
        System.out.println("Lipstick enhances beauty --parent");
    }

    public void makeup() {
        System.out.println("Lipstick is used for makeup --parent");
    }
}
