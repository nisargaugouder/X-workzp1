package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.rose.Rose;

public class RoseRunner {
    public static void main(String[] args) {
        Rose rose = new Rose("Red", 32, true);
        System.out.println(rose);
        System.out.println(rose.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(rose));

        Rose rose1 = new Rose("Pink", 28, false);
        Rose rose2 = new Rose("Red", 32, true);

        boolean same = rose1.equals(rose2);
        System.out.println("same: " + same);
    }
}
