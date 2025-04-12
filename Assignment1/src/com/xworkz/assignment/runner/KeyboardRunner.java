package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.keyboard.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech", true, 104);
        System.out.println(keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(keyboard));

        Keyboard keyboard1 = new Keyboard("HP", false, 101);
        Keyboard keyboard2 = new Keyboard("Logitech", true, 104);

        boolean same = keyboard1.equals(keyboard2);
        System.out.println("same: " + same);
    }
}
