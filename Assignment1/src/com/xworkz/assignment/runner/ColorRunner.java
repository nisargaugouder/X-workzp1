package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.color.Color;

public class ColorRunner {
    public static void main(String[] args) {
        Color color = new Color("Red", "#FF0000", "Primary");
        System.out.println(color);
        System.out.println(color.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(color));
    }
}
