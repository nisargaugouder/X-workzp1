package com.xworkz.late.internal.food;

public class PizzaImpl implements Food {
    public PizzaImpl() {
        System.out.println("no-arg const PizzaImpl");
    }

    @Override
    public void eat() {
        System.out.println("Eating PizzaImpl");
    }
}
