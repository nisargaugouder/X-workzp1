package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.tea.Tea;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea = new Tea("Green", false, 120.0);
        System.out.println(tea);
        System.out.println(tea.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(tea));

        Tea tea1 = new Tea("Green", false, 120.0);
        Tea tea2 = new Tea("Green", false, 120.0);

        boolean same = tea1.equals(tea2);
        System.out.println("same: " + same);
    }
}
