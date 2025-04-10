package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.lipstick.Lipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick = new Lipstick("Lakme", "Red", 450);
        System.out.println(lipstick);
        System.out.println(lipstick.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(lipstick));
    }
}
