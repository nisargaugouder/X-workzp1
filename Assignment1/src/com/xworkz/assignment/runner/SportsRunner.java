package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.sports.Sports;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sports = new Sports("Cricket", 11, "Outdoor");
        System.out.println(sports);
        System.out.println(sports.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(sports));
    }
}
