package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.elephant.Elephant;

public class ElephantRunner {
    public static void main(String[] args) {
        Elephant elephant = new Elephant(25, 5400.5, "African Bush Elephant");
        System.out.println(elephant);
        System.out.println(elephant.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(elephant));
    }
}
