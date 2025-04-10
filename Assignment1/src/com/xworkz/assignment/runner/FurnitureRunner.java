package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.furniture.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Furniture("Chair", "Wood", 1500.0);
        System.out.println(furniture);
        System.out.println(furniture.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(furniture));
    }
}
