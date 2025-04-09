package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.keyboard.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech", true, 104);
        System.out.println(keyboard);
    }
}
