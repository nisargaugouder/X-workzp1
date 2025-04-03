package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pig.Pig;
import com.xworkz.inheritence.internal.pig.WildPig;

public class PigRunner {
    public static void main(String[] args) {
        Pig pig = new WildPig();
        pig.eatEverything();
        pig.liveInMud();
        pig.haveStrongSenseOfSmell();
        pig.socialAnimals();
        pig.intelligent();

        System.out.println("-----------------");
        WildPig wildPig = new WildPig();
        wildPig.eatEverything();
        wildPig.liveInMud();
        wildPig.haveStrongSenseOfSmell();
        wildPig.socialAnimals();
        wildPig.intelligent();
    }
}
