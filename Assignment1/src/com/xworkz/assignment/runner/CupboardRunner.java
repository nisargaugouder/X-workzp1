package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.cupboard.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Wooden", 4, "Brown");
        System.out.println(cupboard);
        System.out.println(cupboard.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(cupboard));

        Cupboard cupboard1 = new Cupboard("Wooden", 4, "Brown");
        Cupboard cupboard2 = new Cupboard("Metal", 3, "White");

        boolean same = cupboard1.equals(cupboard2);
        System.out.println("same: " + same);

    }
}
