package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.metal.Metal;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Metal("Gold", "Precious", 5000);
        System.out.println(metal);
        System.out.println(metal.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(metal));

        Metal metal1 = new Metal("Gold", "Precious", 5000);
        Metal metal2 = new Metal("Gold", "Precious", 5000);

        boolean same = metal1.equals(metal2);
        System.out.println("same: " + same);
    }
}
