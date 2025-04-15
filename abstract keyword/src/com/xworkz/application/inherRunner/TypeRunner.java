package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.type.KeyboardType;
import com.xworkz.application.inheritancetype.type.FontType;

public class TypeRunner {
    public static void main(String[] args) {
        KeyboardType keyboard = new KeyboardType();
        keyboard.isMechanical();
        keyboard.identify();

        FontType font = new FontType();
        font.setFontStyle();
        font.identify();
    }
}
