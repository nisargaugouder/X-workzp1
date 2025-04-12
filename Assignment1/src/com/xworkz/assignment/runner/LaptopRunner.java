package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 70000, "i5");
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(laptop));

        Laptop laptop1 = new Laptop("HP", 65000, "i7");
        Laptop laptop2 = new Laptop("Dell", 70000, "i5");

        boolean same = laptop1.equals(laptop2);
        System.out.println("same: " + same);
    }
}
