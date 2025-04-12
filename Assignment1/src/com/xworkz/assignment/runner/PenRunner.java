package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pen.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(pen));

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        boolean same = pen1.equals(pen2);
        System.out.println("same: " + same);
    }
}
