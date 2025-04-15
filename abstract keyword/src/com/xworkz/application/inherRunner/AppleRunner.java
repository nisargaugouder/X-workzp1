package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.apple.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.grow();
        apple.ripen();
        apple.eat();
    }
}
