package com.xworkz.inheritence.internal.fish;

public class Fish {
    public Fish() {
        System.out.println("Fish exists in water --parent");
    }

    public void livesInWater() {
        System.out.println("Fish lives in water --parent");
    }

    public void breathesThroughGills() {
        System.out.println("Fish breathes using gills --parent");
    }

    public void swimsUsingFins() {
        System.out.println("Fish swims with fins --parent");
    }

    public void comesInDifferentSpecies() {
        System.out.println("Fish has many species --parent");
    }

    public void laysEggs() {
        System.out.println("Fish lays eggs --parent");
    }
}
