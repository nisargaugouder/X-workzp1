package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.river.River;

public class RiverRunner {
    public static void main(String[] args) {
        River river = new River("Ganga", 2525, "Gangotri");
        System.out.println(river);
        System.out.println(river.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(river));
    }
}
