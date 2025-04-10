package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.rose.Rose;

public class RoseRunner {
    public static void main(String[] args) {
        Rose rose = new Rose("Red", 32, true);
        System.out.println(rose);
        System.out.println(rose.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(rose));
    }
}
