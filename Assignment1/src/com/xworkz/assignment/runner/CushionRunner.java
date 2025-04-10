package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.cushion.Cushion;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion cushion = new Cushion("Square", "Red", 500);
        System.out.println(cushion);
        System.out.println(cushion.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(cushion));
    }
}
