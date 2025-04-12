package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.vegetable.Vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable("Carrot", "Orange", 0.5);
        System.out.println(vegetable);
        System.out.println(vegetable.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(vegetable));

        Vegetable vegetable1 = new Vegetable("Carrot", "Orange", 0.5);
        Vegetable vegetable2 = new Vegetable("Carrot", "Orange", 0.5);

        boolean same = vegetable1.equals(vegetable2);
        System.out.println("same: " + same);
    }
}
