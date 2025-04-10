package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.cupboard.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard("Wooden", 4, "Brown");
        System.out.println(cupboard);
        System.out.println(cupboard.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(cupboard));
    }
}
