package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.vegetable.Vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable("Carrot", "Orange", 0.5);
        System.out.println(vegetable);
        System.out.println(vegetable.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(vegetable));
    }
}
