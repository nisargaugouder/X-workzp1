package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.suit.Suit;

public class SuitRunner {
    public static void main(String[] args) {
        Suit suit = new Suit("Wool", "Black", "Medium");
        System.out.println(suit);
        System.out.println(suit.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(suit));
    }
}
