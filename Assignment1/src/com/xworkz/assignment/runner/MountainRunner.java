package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.mountain.Mountain;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain mountain = new Mountain("Everest", 8848, "Nepal");
        System.out.println(mountain);
        System.out.println(mountain.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(mountain));

        Mountain mountain1 = new Mountain("Everest", 8848, "Nepal");
        Mountain mountain2 = new Mountain("Everest", 8848, "Nepal");

        boolean same = mountain1.equals(mountain2);
        System.out.println("same: " + same);
    }
}
