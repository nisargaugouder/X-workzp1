package com.xworkz.inheritence.internal.keyboard;

public class Keyboard {
    public Keyboard() {
        System.out.println("Running non-arg constructor Keyboard");
    }
    public void type() {
        System.out.println("Keyboard is typing");
    }
    public void connect() {
        System.out.println("Keyboard is connecting");
    }
    public void pressKey() {
        System.out.println("Key is pressed");
    }
    public void backlight() {
        System.out.println("Keyboard may have backlight");
    }
}
