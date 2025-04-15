package com.xworkz.application.runner;

import com.xworkz.application.internal.laptop.Dell;
import com.xworkz.application.internal.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new Dell();
        laptop.type();
    }
}
