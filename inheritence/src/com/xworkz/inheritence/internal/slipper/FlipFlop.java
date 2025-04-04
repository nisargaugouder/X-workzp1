package com.xworkz.inheritence.internal.slipper;

public class FlipFlop extends Slipper {
    public FlipFlop() {
        super();
        System.out.println("FlipFlop --child");
    }

    @Override
    public void wear() {
        System.out.println("FlipFlops are lightweight and easy to wear --child");
    }

    @Override
    public void walk() {
        System.out.println("FlipFlops are ideal for casual walking --child");
    }

    @Override
    public void grip() {
        System.out.println("FlipFlops provide a flexible grip --child");
    }

    @Override
    public void comfort() {
        System.out.println("FlipFlops are designed for everyday comfort --child");
    }

    @Override
    public void relax() {
        System.out.println("FlipFlops are great for relaxing --child");
    }
}
