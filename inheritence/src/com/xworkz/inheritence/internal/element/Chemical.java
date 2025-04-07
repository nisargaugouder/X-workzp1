package com.xworkz.inheritence.internal.element;

public class Chemical {
    public void property(Element element) {
        element.atomicNumber();
        element.symbol();
        element.state();
        element.bonding();
        element.reactivity();

        if (element instanceof Oxygen) {
            System.out.println("Element is instance of Oxygen");
            Oxygen oxygen = (Oxygen) element;
            oxygen.supportLife();
        }
    }
}
