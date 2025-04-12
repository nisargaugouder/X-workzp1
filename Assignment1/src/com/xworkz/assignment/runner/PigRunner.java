package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pig.Pig;

public class PigRunner {
    public static void main(String[] args) {
        Pig pig = new Pig("Yorkshire", 2, 150.5);
        System.out.println(pig);
        System.out.println(pig.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(pig));

        Pig pig1 = new Pig("Berkshire", 3, 120.0);
        Pig pig2 = new Pig("Yorkshire", 2, 150.5);

        boolean same = pig1.equals(pig2);
        System.out.println("same: " + same);
    }
}
