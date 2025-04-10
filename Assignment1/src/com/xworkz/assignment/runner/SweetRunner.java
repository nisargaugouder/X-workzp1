package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.sweet.Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet("Gulab Jamun", "India", false);
        System.out.println(sweet);
        System.out.println(sweet.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(sweet));
    }
}
