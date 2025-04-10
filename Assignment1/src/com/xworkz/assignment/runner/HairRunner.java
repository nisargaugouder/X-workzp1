package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.hair.Hair;

public class HairRunner {
    public static void main(String[] args) {
        Hair hair = new Hair("Black", "Curly", 12.5);
        System.out.println(hair);
        System.out.println(hair.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(hair));
    }
}
