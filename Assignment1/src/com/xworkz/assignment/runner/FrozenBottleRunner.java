package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.frozenbottle.FrozenBottle;

public class FrozenBottleRunner {
    public static void main(String[] args) {
        FrozenBottle frozenBottle1 = new FrozenBottle("Chocolate", 150.0, "Shake");
        FrozenBottle frozenBottle2 = new FrozenBottle("Mango", 120.0, "Juice");

        System.out.println(frozenBottle1);
        System.out.println(frozenBottle1.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(frozenBottle1));

        System.out.println(frozenBottle2);
        System.out.println(frozenBottle2.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(frozenBottle2));

        boolean same = frozenBottle1.equals(frozenBottle2);
        System.out.println("same: " + same);
    }
}
