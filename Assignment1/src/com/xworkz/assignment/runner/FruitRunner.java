package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.fruit.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit("Mango", "Yellow", 100.0);
        System.out.println(fruit);
        System.out.println(fruit.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(fruit));
    }
}
