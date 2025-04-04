package com.xworkz.inheritence.internal.planet;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("Earth --child");
    }

    @Override
    public void orbit() {
        System.out.println("Earth orbits the Sun in 365 days --child");
    }

    @Override
    public void gravity() {
        System.out.println("Earth has 9.8 m/s² gravity --child");
    }

    @Override
    public void atmosphere() {
        System.out.println("Earth has a breathable atmosphere --child");
    }

    @Override
    public void life() {
        System.out.println("Earth supports diverse life forms --child");
    }

    @Override
    public void ocean() {
        System.out.println("Earth's surface is 71% ocean --child");
    }
}
