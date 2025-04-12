package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.milk.Milk;

public class MilkRunner {
    public static void main(String[] args) {
        Milk milk = new Milk("Nandini", "Toned", 42);
        System.out.println(milk);
        System.out.println(milk.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(milk));

        Milk milk1 = new Milk("Amul", "Full Cream", 50);
        Milk milk2 = new Milk("Nandini", "Toned", 42);

        boolean same = milk1.equals(milk2);
        System.out.println("same: " + same);
    }
}
