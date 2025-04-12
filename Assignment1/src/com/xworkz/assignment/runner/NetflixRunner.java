package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.netflix.Netflix;

public class NetflixRunner {
    public static void main(String[] args) {
        Netflix netflix = new Netflix("Premium", 649, 4);
        System.out.println(netflix);
        System.out.println(netflix.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(netflix));

        Netflix netflix1 = new Netflix("Premium", 649, 4);
        Netflix netflix2 = new Netflix("Premium", 649, 4);

        boolean same = netflix1.equals(netflix2);
        System.out.println("same: " + same);
    }
}
