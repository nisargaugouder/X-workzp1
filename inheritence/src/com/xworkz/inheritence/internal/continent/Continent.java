package com.xworkz.inheritence.internal.continent;

public class Continent {
    public Continent() {
        System.out.println("Running non-arg constructor Continent--parent");
    }

    public void countries() {
        System.out.println("Continents have many countries--parent");
    }

    public void population() {
        System.out.println("Continents have a diverse population--parent");
    }

    public void culture() {
        System.out.println("Continents have unique cultures--parent");
    }

    public void economy() {
        System.out.println("Continents contribute to global economy--parent");
    }

    public void climate() {
        System.out.println("Continents have varied climates--parent");
    }
}
