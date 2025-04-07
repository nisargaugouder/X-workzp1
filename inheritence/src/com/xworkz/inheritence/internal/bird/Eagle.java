package com.xworkz.inheritence.internal.bird;

public class Eagle extends Bird {

    public Eagle() {
        super();
        System.out.println("Running no-arg constructor Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flies very high--child");
    }

    @Override
    public void feathers() {
        System.out.println("Eagle has strong feathers--child");
    }

    @Override
    public void layEggs() {
        System.out.println("Eagle lays 2-3 eggs--child");
    }

    @Override
    public void sound() {
        System.out.println("Eagle makes screech sound--child");
    }

    @Override
    public void vision() {
        System.out.println("Eagle has excellent vision--child");
    }

    public void hunt() {
        System.out.println("New method hunt in child class");
    }
}
