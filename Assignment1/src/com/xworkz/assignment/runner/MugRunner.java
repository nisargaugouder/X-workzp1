package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.mug.Mug;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new Mug("White", "Ceramic", 150);
        System.out.println(mug);
        System.out.println(mug.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(mug));

        Mug mug1 = new Mug("Black", "Plastic", 100);
        Mug mug2 = new Mug("White", "Ceramic", 150);

        boolean same = mug1.equals(mug2);
        System.out.println("same: " + same);
    }
}
