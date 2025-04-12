package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.suger.Suger;

public class SugerRunner {
    public static void main(String[] args) {
        Suger suger = new Suger("Brown", 50, "Brown");
        System.out.println(suger);
        System.out.println(suger.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(suger));

        Suger suger1 = new Suger("White", 40, "White");
        Suger suger2 = new Suger("Brown", 50, "Brown");

        boolean same = suger1.equals(suger2);
        System.out.println("same: " + same);
    }
}
