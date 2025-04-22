package com.xworkz.late.internal.duck;

public class WhiteDuckImpl implements Duck {
    public WhiteDuckImpl() {
        System.out.println("no-arg const WhiteDuckImpl");
    }

    @Override
    public void quack() {
        System.out.println("quack quack in WhiteDuckImpl");
    }
}
