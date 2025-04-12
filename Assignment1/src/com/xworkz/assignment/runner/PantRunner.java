package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pant.Pant;

public class PantRunner {
    public static void main(String[] args) {
        Pant pant = new Pant("LV", "XS", "Blue");
        System.out.println(pant);
        System.out.println(pant.hashCode());
        System.out.println("Original:" + System.identityHashCode(pant));

        Pant pant1 = new Pant("LV", "XS", "Blue");
        Pant pant2 = new Pant("LV", "XS", "Blue");

        boolean same = pant1.equals(pant2);
        System.out.println("same: " + same);
    }
}
