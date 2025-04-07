package com.xworkz.inheritence.internal.bike;

public class SportsBike extends Bike {

    public SportsBike() {
        super();
        System.out.println("Running no-arg constructor SportsBike");
    }

    @Override
    public void transport() {
        System.out.println("SportsBike is used for fast transport--child");
    }

    @Override
    public void wheels() {
        System.out.println("SportsBike has stylish wheels--child");
    }

    @Override
    public void fuel() {
        System.out.println("SportsBike uses high-octane fuel--child");
    }

    @Override
    public void safety() {
        System.out.println("SportsBike requires safety gears--child");
    }

    @Override
    public void model() {
        System.out.println("SportsBike has advanced models--child");
    }

    public void stunts() {
        System.out.println("New method stunts in child class");
    }
}
