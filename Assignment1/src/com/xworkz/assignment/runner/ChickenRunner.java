package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.chicken.Chicken;

public class ChickenRunner {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("Leghorn", 1, false);
        System.out.println(chicken);
        System.out.println(chicken.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(chicken));

        Chicken chicken1 = new Chicken("Leghorn", 1, false);
        Chicken chicken2 = new Chicken("Leghorn", 1, false);

        boolean same = chicken1.equals(chicken2);
        System.out.println("same:" + same);
    }
}
