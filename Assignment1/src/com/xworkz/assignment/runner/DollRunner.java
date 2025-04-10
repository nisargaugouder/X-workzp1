package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.doll.Doll;

public class DollRunner {
    public static void main(String[] args) {
        Doll doll = new Doll("Barbie", "Plastic", 30);
        System.out.println(doll);
        System.out.println(doll.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(doll));
    }
}
