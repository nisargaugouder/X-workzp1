package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.kurtha.Kurtha;

public class KurthaRunner {
    public static void main(String[] args) {
        Kurtha kurtha = new Kurtha("Cotton", "Medium", "Blue");
        System.out.println(kurtha);
        System.out.println(kurtha.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(kurtha));

        Kurtha kurtha1 = new Kurtha("Silk", "Large", "Red");
        Kurtha kurtha2 = new Kurtha("Cotton", "Medium", "Blue");

        boolean same = kurtha1.equals(kurtha2);
        System.out.println("same: " + same);
    }
}
