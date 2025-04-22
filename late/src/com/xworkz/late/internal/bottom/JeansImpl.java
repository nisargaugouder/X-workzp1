package com.xworkz.late.internal.bottom;

public class JeansImpl implements Bottom {
    public JeansImpl() {
        System.out.println("no-arg constructor of JeansImpl");
    }

    @Override
    public void wear() {
        System.out.println("Wearing jeans");
    }
}
