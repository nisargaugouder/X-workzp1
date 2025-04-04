package com.xworkz.inheritence.internal.planet;

public class Planet {
    public Planet() {
        System.out.println("Planet --parent");
    }

    public void orbit() {
        System.out.println("Planet orbits the Sun --parent");
    }

    public void gravity() {
        System.out.println("Planet has gravitational force --parent");
    }

    public void atmosphere() {
        System.out.println("Planet has an atmosphere --parent");
    }

    public void life() {
        System.out.println("Some planets support life --parent");
    }

    public void ocean() {
        System.out.println("Some planets have oceans --parent");
    }
}
