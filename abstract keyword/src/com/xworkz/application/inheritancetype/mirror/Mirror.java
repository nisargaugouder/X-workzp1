package com.xworkz.application.inheritancetype.mirror;

public class Mirror extends Glass {
    Frame frame = new Frame();

    public void reflect() {
        frame.holdGlass();
    }
}
