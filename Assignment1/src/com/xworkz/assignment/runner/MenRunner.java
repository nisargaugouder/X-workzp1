package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.men.Men;

public class MenRunner {
    public static void main(String[] args) {
        Men men = new Men("Ravi", 28, "Engineer");
        System.out.println(men);
        System.out.println(men.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(men));
    }
}
