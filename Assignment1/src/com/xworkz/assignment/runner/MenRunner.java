package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.men.Men;

public class MenRunner {
    public static void main(String[] args) {
        Men men = new Men("Ravi", 28, "Engineer");
        System.out.println(men);
        System.out.println(men.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(men));

        Men men1 = new Men("Kiran", 30, "Doctor");
        Men men2 = new Men("Ravi", 28, "Engineer");

        boolean same = men1.equals(men2);
        System.out.println("same: " + same);
    }
}
