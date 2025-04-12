package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.stationary.Stationary;

public class StationaryRunner {
    public static void main(String[] args) {
        Stationary stationary = new Stationary("Pen", 20, "Cello");
        System.out.println(stationary);
        System.out.println(stationary.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(stationary));

        Stationary stationary1 = new Stationary("Pencil", 10, "Apsara");
        Stationary stationary2 = new Stationary("Pen", 20, "Cello");

        boolean same = stationary1.equals(stationary2);
        System.out.println("same: " + same);
    }
}
