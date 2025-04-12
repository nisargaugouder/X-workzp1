package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.hair.Hair;

public class HairRunner {
    public static void main(String[] args) {
        Hair hair = new Hair("Black", "Curly", 12.5);
        System.out.println(hair);
        System.out.println(hair.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(hair));

        Hair hair1 = new Hair("Brown", "Straight", 10.0);
        Hair hair2 = new Hair("Black", "Curly", 12.5);
        boolean same = hair1.equals(hair2);
        System.out.println("same:" + same);
    }
}
