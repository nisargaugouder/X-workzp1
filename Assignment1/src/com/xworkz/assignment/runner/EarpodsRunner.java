package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.earpods.Earpods;

public class EarpodsRunner {
    public static void main(String[] args) {
        Earpods earpods = new Earpods("Apple", true, 24);
        System.out.println(earpods);
    }
}
