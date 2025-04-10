package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.goa.Goa;

public class GoaRunner {
    public static void main(String[] args) {
        Goa goa = new Goa("Baga Beach", "North Goa", true);
        System.out.println(goa);
        System.out.println(goa.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(goa));
    }
}
