package com.xworkz.inheritence.internal.bird;

public class Eagle extends Bird {
    public Eagle() {
        super();
        System.out.println("Running non-arg constructor Eagle");
    }
    @Override
    public void fly() {
        System.out.println("Eagle flies high and fast--child");
    }
    @Override
    public void feathers() {
        System.out.println("Eagle has strong and dark feathers--child");
    }
    @Override
    public void layEggs() {
        System.out.println("Eagle lays eggs in high places--child");
    }
    @Override
    public void sound() {
        System.out.println("Eagle makes a sharp screeching sound--child");
    }
    @Override
    public void vision() {
        System.out.println("Eagle has extremely sharp vision--child");
    }
}
