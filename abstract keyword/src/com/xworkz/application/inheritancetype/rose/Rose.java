package com.xworkz.application.inheritancetype.rose;

public class Rose extends Flower {
    Smell smell = new Smell();

    public void fragrance() {
        smell.spread();
    }
}
