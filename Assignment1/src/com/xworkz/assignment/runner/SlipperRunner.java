package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.slipper.Slipper;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper slipper = new Slipper("Puma", "Rubber", 8);
        System.out.println(slipper);
        System.out.println(slipper.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(slipper));

        Slipper slipper1 = new Slipper("Adidas", "Foam", 9);
        Slipper slipper2 = new Slipper("Puma", "Rubber", 8);

        boolean same = slipper1.equals(slipper2);
        System.out.println("same: " + same);
    }
}
