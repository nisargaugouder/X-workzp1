package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.suitcase.Suitcase;

public class SuitcaseRunner {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase("Samsonite", 35.0, true);
        System.out.println(suitcase);
        System.out.println(suitcase.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(suitcase));

        Suitcase suitcase1 = new Suitcase("American Tourister", 30.0, false);
        Suitcase suitcase2 = new Suitcase("Samsonite", 35.0, true);

        boolean same = suitcase1.equals(suitcase2);
        System.out.println("same: " + same);
    }
}
