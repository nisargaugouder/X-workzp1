package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.wine.Wine;

public class WineRunner {
    public static void main(String[] args) {
        Wine wine = new Wine("Sula", "Red", 1200);
        System.out.println(wine);
        System.out.println(wine.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(wine));
    }
}
