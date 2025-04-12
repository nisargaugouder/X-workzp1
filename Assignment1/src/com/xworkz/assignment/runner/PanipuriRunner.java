package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.panipuri.Panipuri;

public class PanipuriRunner {
    public static void main(String[] args) {
        Panipuri panipuri = new Panipuri("Potato", "Mint", 6);
        System.out.println(panipuri);
        System.out.println(panipuri.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(panipuri));

        Panipuri panipuri1 = new Panipuri("Sprouts", "Tamarind", 5);
        Panipuri panipuri2 = new Panipuri("Potato", "Mint", 6);

        boolean same = panipuri1.equals(panipuri2);
        System.out.println("same: " + same);
    }
}
