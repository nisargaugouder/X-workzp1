package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.trolley.Trolley;

public class TrolleyRunner {
    public static void main(String[] args) {
        Trolley trolley = new Trolley("Shopping", 50.0, false);
        System.out.println(trolley);
        System.out.println(trolley.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(trolley));
    }
}
