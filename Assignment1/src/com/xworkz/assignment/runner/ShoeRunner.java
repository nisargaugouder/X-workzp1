package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.shoe.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 9, "Black");
        System.out.println(shoe);
        System.out.println(shoe.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(shoe));

        Shoe shoe1 = new Shoe("Adidas", 8, "White");
        Shoe shoe2 = new Shoe("Nike", 9, "Black");

        boolean same = shoe1.equals(shoe2);
        System.out.println("same: " + same);
    }
}
