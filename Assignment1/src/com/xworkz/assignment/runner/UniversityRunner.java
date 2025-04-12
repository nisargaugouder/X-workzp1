package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.university.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University("Harvard", "Cambridge", 1636);
        System.out.println(university);
        System.out.println(university.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(university));

        University university1 = new University("Harvard", "Cambridge", 1636);
        University university2 = new University("Harvard", "Cambridge", 1636);

        boolean same = university1.equals(university2);
        System.out.println("same: " + same);
    }
}
