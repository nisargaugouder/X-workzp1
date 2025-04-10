package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.cup.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("Coffee Cup", 120, "Ceramic");
        System.out.println(cup);
        System.out.println(cup.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(cup));
    }
}
