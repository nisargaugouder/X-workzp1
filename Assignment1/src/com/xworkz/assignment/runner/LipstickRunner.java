package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.lipstick.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Lakme", "Red", 450);
        System.out.println(lipstick);
        System.out.println(lipstick.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(lipstick));

        Lipstick lipstick1 = new Lipstick("Maybelline", "Pink", 500);
        Lipstick lipstick2 = new Lipstick("Lakme", "Red", 450);

        boolean same = lipstick1.equals(lipstick2);
        System.out.println("same: " + same);
    }
}
