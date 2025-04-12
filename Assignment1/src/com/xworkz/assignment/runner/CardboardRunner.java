package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.cardboard.Cardboard;

public class CardboardRunner {
    public static void main(String[] args) {
        Cardboard cardboard = new Cardboard("Corrugated", 0.5, "Brown");
        System.out.println(cardboard);
        System.out.println(cardboard.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(cardboard));

        Cardboard cardboard1 = new Cardboard("Corrugated", 0.5, "Brown");
        Cardboard cardboard2 = new Cardboard("Corrugated", 0.5, "Brown");

        boolean same = cardboard1.equals(cardboard2);
        System.out.println("same:" + same);
    }
}
