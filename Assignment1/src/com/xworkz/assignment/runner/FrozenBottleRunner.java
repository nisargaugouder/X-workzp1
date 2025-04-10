package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.frozenbottle.FrozenBottle;

public class FrozenBottleRunner {
    public static void main(String[] args) {
        FrozenBottle frozenBottle = new FrozenBottle("Chocolate", 150.0, "Shake");
        System.out.println(frozenBottle);
        System.out.println(frozenBottle.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(frozenBottle));
    }
}
