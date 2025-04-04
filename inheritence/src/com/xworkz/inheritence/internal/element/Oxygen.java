package com.xworkz.inheritence.internal.element;

public class Oxygen extends Element {
    public Oxygen() {
        super();
        System.out.println("Oxygen created --child");
    }

    @Override
    public void atomicNumber() {
        System.out.println("Oxygen has atomic number 8 --child");
    }

    @Override
    public void symbol() {
        System.out.println("Oxygen symbol is O --child");
    }

    @Override
    public void state() {
        System.out.println("Oxygen is a gas at room temperature --child");
    }

    @Override
    public void bonding() {
        System.out.println("Oxygen forms covalent bonds --child");
    }

    @Override
    public void reactivity() {
        System.out.println("Oxygen is highly reactive --child");
    }
}
