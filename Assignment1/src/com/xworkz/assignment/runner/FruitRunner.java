package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.fruit.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Mango", "Yellow", 100.0);
        Fruit fruit2 = new Fruit("Mango", "Yellow", 100.0);  // Same values for comparison
        Fruit fruit3 = new Fruit("Apple", "Red", 120.0);     // Different values for comparison

        System.out.println(fruit1);
        System.out.println(fruit1.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(fruit1));

        System.out.println(fruit2);
        System.out.println(fruit2.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(fruit2));

        System.out.println("fruit1 equals fruit2 : " + fruit1.equals(fruit2));  // should return true if equals overridden
        System.out.println("fruit1 equals fruit3 : " + fruit1.equals(fruit3));  // should return false
    }
}
