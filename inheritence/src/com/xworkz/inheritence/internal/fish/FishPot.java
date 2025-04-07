package com.xworkz.inheritence.internal.fish;

public class FishPot {
    public void aqua(Fish fish){
        fish.breathesThroughGills();
        fish.laysEggs();
        fish.comesInDifferentSpecies();
        fish.livesInWater();
        fish.swimsUsingFins();

        if(fish instanceof GoldFish){
            System.out.println("fish instanceof GoldFish");
            GoldFish goldFish=(GoldFish) fish;
            goldFish.gold();
        }
    }
}
