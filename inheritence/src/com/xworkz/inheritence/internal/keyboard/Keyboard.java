package com.xworkz.inheritence.internal.keyboard;

public class Keyboard {
    public Keyboard() {
        System.out.println("Keyboard --parent");
    }

    public void type() {
        System.out.println("Typing on keyboard --parent");
    }

    public void connect() {
        System.out.println("Connecting keyboard --parent");
    }

    public void press() {
        System.out.println("Pressing key --parent");
    }

    public void backlight() {
        System.out.println("Backlight feature --parent");
    }

    public void wireless() {
        System.out.println("Wireless support --parent");
    }
}
