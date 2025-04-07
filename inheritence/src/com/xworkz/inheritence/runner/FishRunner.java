package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.fish.Fish;
import com.xworkz.inheritence.internal.fish.FishPot;
import com.xworkz.inheritence.internal.fish.GoldFish;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.livesInWater();
        fish.breathesThroughGills();
        fish.swimsUsingFins();
        fish.comesInDifferentSpecies();
        fish.laysEggs();

        System.out.println("-----------------");

        Fish goldFishRef = new GoldFish();
        goldFishRef.livesInWater();
        goldFishRef.breathesThroughGills();
        goldFishRef.swimsUsingFins();
        goldFishRef.comesInDifferentSpecies();
        goldFishRef.laysEggs();

        System.out.println("-----------------");

        GoldFish goldFish = new GoldFish();
        goldFish.livesInWater();
        goldFish.breathesThroughGills();
        goldFish.swimsUsingFins();
        goldFish.comesInDifferentSpecies();
        goldFish.laysEggs();

        System.out.println("---------casting");
        FishPot fishPot=new FishPot();
        fishPot.aqua(fish);
        fishPot.aqua(goldFish);
        fishPot.aqua(goldFishRef);
    }
}
