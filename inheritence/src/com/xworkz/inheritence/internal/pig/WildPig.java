package com.xworkz.inheritence.internal.pig;

public class WildPig extends Pig {
    public WildPig() {
        super();
        System.out.println("WildPig --child");
    }

    @Override
    public void eat() {
        System.out.println("WildPig eats roots and small animals --child");
    }

    @Override
    public void live() {
        System.out.println("WildPig lives in forests --child");
    }

    @Override
    public void smell() {
        System.out.println("WildPig uses smell to find food --child");
    }

    @Override
    public void social() {
        System.out.println("WildPig moves in groups --child");
    }

    @Override
    public void smart() {
        System.out.println("WildPig adapts to environments quickly --child");
    }
}
