package com.xworkz.inheritence.internal.keyboard;

public class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard() {
        super();
        System.out.println("MechanicalKeyboard --child");
    }

    @Override
    public void type() {
        System.out.println("Typing on mechanical keys --child");
    }

    @Override
    public void connect() {
        System.out.println("Connecting via USB --child");
    }

    @Override
    public void press() {
        System.out.println("Pressing mechanical switch --child");
    }

    @Override
    public void backlight() {
        System.out.println("RGB backlight --child");
    }

    @Override
    public void wireless() {
        System.out.println("Supports Bluetooth --child");
    }
    public void solid(){
        System.out.println("new method solid in child class");
    }
}
