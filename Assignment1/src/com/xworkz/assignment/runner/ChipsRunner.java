package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.chips.Chips;

public class ChipsRunner {
    public static void main(String[] args) {
        Chips chips = new Chips("Masala", 50, 20);
        System.out.println(chips);
        System.out.println(chips.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(chips));

        Chips chips1 = new Chips("Salted", 30, 10);
        Chips chips2 = new Chips("Cream & Onion", 40, 15);

        boolean same = chips1.equals(chips2);
        System.out.println("same:" + same);
    }
}
