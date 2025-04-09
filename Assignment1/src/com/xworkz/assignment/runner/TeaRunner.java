package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.tea.Tea;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea = new Tea("Green", false, 120.0);
        System.out.println(tea);
    }
}
