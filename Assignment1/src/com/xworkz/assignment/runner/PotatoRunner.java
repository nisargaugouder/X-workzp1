package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.potato.Potato;

public class PotatoRunner {
    public static void main(String[] args) {
        Potato potato = new Potato("Russet", 0.3, "India");
        System.out.println(potato);
        System.out.println(potato.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(potato));

        Potato potato1 = new Potato("Russet", 0.3, "India");
        Potato potato2 = new Potato("Russet", 0.3, "India");

        boolean same = potato1.equals(potato2);
        System.out.println("same: " + same);
    }
}
