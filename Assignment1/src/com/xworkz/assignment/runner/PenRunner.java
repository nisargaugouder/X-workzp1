package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pen.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen();
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(pen));
    }
}
