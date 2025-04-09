package com.xworkz.assignment.internal.element;

public class Element {
    private String name;
    private String symbol;
    private int atomicNumber;

    public Element(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                '}';
    }
}
