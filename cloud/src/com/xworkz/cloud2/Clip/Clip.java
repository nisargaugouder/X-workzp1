package com.xworkz.cloud2.Clip;

public class Clip {
    String color;

    public Clip(String color) {
        this.color = color;
    }

    public void hold() {
        System.out.println(color + " clip is running");

    }
}