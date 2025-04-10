package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.university.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University("Harvard", "Cambridge", 1636);
        System.out.println(university);
        System.out.println(university.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(university));
    }
}
