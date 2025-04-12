package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.ocean.Ocean;

public class OceanRunner {
    public static void main(String[] args) {
        Ocean ocean = new Ocean("Pacific", 165.25, 3970);
        System.out.println(ocean);
        System.out.println(ocean.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(ocean));

        Ocean ocean1 = new Ocean("Pacific", 165.25, 3970);
        Ocean ocean2 = new Ocean("Pacific", 165.25, 3970);

        boolean same = ocean1.equals(ocean2);
        System.out.println("same: " + same);
    }
}
