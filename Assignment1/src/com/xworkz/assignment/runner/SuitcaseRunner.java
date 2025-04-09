package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.suitcase.Suitcase;

public class SuitcaseRunner {
    public static void main(String[] args) {
        Suitcase suitcase = new Suitcase("Samsonite", 35.0, true);
        System.out.println(suitcase);
    }
}
