package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.towel.Towel;
import com.xworkz.inheritence.internal.towel.BathTowel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new BathTowel();
        towel.absorbWater();
        towel.madeOfCotton();
        towel.availableInSizes();
        towel.usedInBathroom();
        towel.requiresWashing();

        System.out.println("-----------------");
        BathTowel bathTowel = new BathTowel();
        bathTowel.absorbWater();
        bathTowel.madeOfCotton();
        bathTowel.availableInSizes();
        bathTowel.usedInBathroom();
        bathTowel.requiresWashing();
    }
}
