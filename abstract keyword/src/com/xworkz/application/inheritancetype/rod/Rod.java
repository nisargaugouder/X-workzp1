package com.xworkz.application.inheritancetype.rod;

public class Rod extends Metal {
    Grip grip = new Grip();

    public void support() {
        grip.hold();
    }
}
