package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.slipper.Slipper;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper slipper = new Slipper("Puma", "Rubber", 8);
        System.out.println(slipper);
        System.out.println(slipper.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(slipper));
    }
}
