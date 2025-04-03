package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.keyboard.Keyboard;
import com.xworkz.inheritence.internal.keyboard.MechanicalKeyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new MechanicalKeyboard();
        keyboard.type();
        keyboard.connect();
        keyboard.pressKey();
        keyboard.backlight();

        System.out.println("-----------------");
        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.type();
        mechanicalKeyboard.connect();
        mechanicalKeyboard.pressKey();
        mechanicalKeyboard.backlight();
    }
}
