package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 70000, "i5");
        System.out.println(laptop);
    }
}
