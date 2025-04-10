package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pig.Pig;

public class PigRunner {
    public static void main(String[] args) {
        Pig pig = new Pig("Yorkshire", 2, 150.5);
        System.out.println(pig);
        System.out.println(pig.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(pig));
    }
}
