package com.xworkz.inheritence.internal.keyboard;

public class Plastic {
    public void madeOf(Keyboard keyboard){
        keyboard.backlight();
        keyboard.connect();
        keyboard.press();
        keyboard.type();
        keyboard.wireless();

        if(keyboard instanceof MechanicalKeyboard){
            MechanicalKeyboard mechanicalKeyboard=(MechanicalKeyboard) keyboard;
            mechanicalKeyboard.solid();
        }
    }
}
