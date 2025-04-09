package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.color.Color;

public class ColorRunner {
    public static void main(String[] args) {
        Color color = new Color("Red", "#FF0000", "Primary");
        System.out.println(color);
    }
}
