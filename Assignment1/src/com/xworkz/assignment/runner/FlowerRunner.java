package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.flower.Flower;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Flower("Rose", "Red", 32);
        System.out.println(flower);
        System.out.println(flower.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(flower));

        Flower flower1 = new Flower("Rose", "Red", 32);
        Flower flower2 = new Flower("Rose", "Red", 32);

        boolean same = flower1.equals(flower2);
        System.out.println("same: " + same);
    }
}
