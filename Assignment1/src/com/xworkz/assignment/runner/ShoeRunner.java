package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.shoe.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 9, "Black");
        System.out.println(shoe);
        System.out.println(shoe.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(shoe));
    }
}
