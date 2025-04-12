package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.dress.Dress;

public class DressRunner {
    public static void main(String[] args) {
        Dress dress = new Dress("Evening Gown", "M", "Red");
        System.out.println(dress);
        System.out.println(dress.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(dress));

        Dress dress1 = new Dress("Evening Gown", "M", "Red");
        Dress dress2 = new Dress("Party Wear", "L", "Blue");

        boolean same = dress1.equals(dress2);
        System.out.println("same:" + same);
    }
}
