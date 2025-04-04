package com.xworkz.inheritence.internal.swim;

public class FreestyleSwim extends Swim {
    public FreestyleSwim() {
        super();
        System.out.println("FreestyleSwim --child");
    }

    @Override
    public void health() {
        System.out.println("Freestyle swimming improves heart health --child");
    }

    @Override
    public void water() {
        System.out.println("Freestyle swimming needs deep water --child");
    }

    @Override
    public void exercise() {
        System.out.println("Freestyle swimming strengthens muscles --child");
    }

    @Override
    public void sport() {
        System.out.println("Freestyle swimming is an Olympic sport --child");
    }

    @Override
    public void styles() {
        System.out.println("Freestyle is the fastest swimming style --child");
    }
}
