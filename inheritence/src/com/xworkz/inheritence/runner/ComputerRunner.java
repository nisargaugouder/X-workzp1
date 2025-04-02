package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.computer.Computers;
import com.xworkz.inheritence.internal.computer.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {
        Computers comp = new Laptop();
        comp.process();
        comp.display();
        comp.store();
        comp.connect();
        comp.runPrograms();

        System.out.println("----------");
        Laptop laptop=new Laptop();
        laptop.process();
        laptop.display();
        laptop.store();
        laptop.connect();
        laptop.runPrograms();

    }
}
