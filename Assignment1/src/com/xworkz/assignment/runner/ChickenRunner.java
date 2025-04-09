package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.chicken.Chicken;

public class ChickenRunner {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("Leghorn", 1, false);
        System.out.println(chicken);
    }
}
