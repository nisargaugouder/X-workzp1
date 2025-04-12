package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.sports.Sports;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sports = new Sports("Cricket", 11, "Outdoor");
        System.out.println(sports);
        System.out.println(sports.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(sports));

        Sports sports1 = new Sports("Football", 11, "Outdoor");
        Sports sports2 = new Sports("Cricket", 11, "Outdoor");

        boolean same = sports1.equals(sports2);
        System.out.println("same: " + same);
    }
}
