package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.doll.Doll;

public class DollRunner {
    public static void main(String[] args) {
        Doll doll = new Doll("Barbie", "Plastic", 30);
        System.out.println(doll);
        System.out.println(doll.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(doll));

        Doll doll1 = new Doll("Ken", "Metal", 25);
        Doll doll2 = new Doll("Barbie", "Plastic", 30);

        boolean same = doll1.equals(doll2);
        System.out.println("same:" + same);
    }
}
