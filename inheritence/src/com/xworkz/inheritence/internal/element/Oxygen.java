package com.xworkz.inheritence.internal.element;

public class Oxygen extends Element {
    public Oxygen() {
        super();
        System.out.println("Running non-arg constructor Oxygen--child");
    }

    @Override
    public void atomicNumber() {
        System.out.println("Atomic Number of Oxygen is 8--child");
    }

    @Override
    public void symbol() {
        System.out.println("Symbol of Oxygen is O--child");
    }

    @Override
    public void state() {
        System.out.println("Oxygen exists as a gas--child");
    }

    @Override
    public void bonding() {
        System.out.println("Oxygen forms covalent bonds--child");
    }

    @Override
    public void reactivity() {
        System.out.println("Oxygen is highly reactive--child");
    }

    public void supportLife() {
        System.out.println("Oxygen supports life on Earth--child specific method");
    }
}
