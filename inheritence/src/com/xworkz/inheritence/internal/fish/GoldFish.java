package com.xworkz.inheritence.internal.fish;

public class GoldFish extends Fish {
    public GoldFish() {
        super();
        System.out.println("GoldFish is a beautiful pet --child");
    }

    @Override
    public void livesInWater() {
        System.out.println("GoldFish thrives in fresh water --child");
    }

    @Override
    public void breathesThroughGills() {
        System.out.println("GoldFish breathes through small gills --child");
    }

    @Override
    public void swimsUsingFins() {
        System.out.println("GoldFish swims gracefully --child");
    }

    @Override
    public void comesInDifferentSpecies() {
        System.out.println("GoldFish has various breeds --child");
    }

    @Override
    public void laysEggs() {
        System.out.println("GoldFish lays eggs for reproduction --child");
    }

    public void gold(){
        System.out.println("new method gold in child class");
    }
}
