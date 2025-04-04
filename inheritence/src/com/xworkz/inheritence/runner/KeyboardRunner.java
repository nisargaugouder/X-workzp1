package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.keyboard.Keyboard;
import com.xworkz.inheritence.internal.keyboard.MechanicalKeyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        keyboard.type();
        keyboard.connect();
        keyboard.press();
        keyboard.backlight();
        keyboard.wireless();

        System.out.println("-----------");

        Keyboard keyboard2 = new MechanicalKeyboard();
        keyboard2.type();
        keyboard2.connect();
        keyboard2.press();
        keyboard2.backlight();
        keyboard2.wireless();

        System.out.println("-----------");

        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.type();
        mechanicalKeyboard.connect();
        mechanicalKeyboard.press();
        mechanicalKeyboard.backlight();
        mechanicalKeyboard.wireless();
    }
}
