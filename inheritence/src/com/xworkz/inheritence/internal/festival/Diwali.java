package com.xworkz.inheritence.internal.festival;

public class Diwali extends Festival {
    public Diwali() {
        super();
        System.out.println("Diwali celebrations start! --child");
    }

    @Override
    public void celebrate() {
        System.out.println("Diwali is celebrated with lights --child");
    }

    @Override
    public void traditions() {
        System.out.println("Diwali includes puja and crackers --child");
    }

    @Override
    public void holidays() {
        System.out.println("Diwali gives long holidays --child");
    }

    @Override
    public void food() {
        System.out.println("Diwali has sweets and snacks --child");
    }

    @Override
    public void gathering() {
        System.out.println("Diwali is celebrated with family --child");
    }
}
