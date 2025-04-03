package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.suit.Suit;
import com.xworkz.inheritence.internal.suit.WeddingSuit;

public class SuitRunner {
    public static void main(String[] args) {
        Suit suit = new WeddingSuit();
        suit.wornOnSpecialOccasions();
        suit.madeOfExpensiveFabric();
        suit.availableInDifferentStyles();
        suit.enhancesPersonality();
        suit.requiresProperFitting();

        System.out.println("-----------------");
        WeddingSuit weddingSuit = new WeddingSuit();
        weddingSuit.wornOnSpecialOccasions();
        weddingSuit.madeOfExpensiveFabric();
        weddingSuit.availableInDifferentStyles();
        weddingSuit.enhancesPersonality();
        weddingSuit.requiresProperFitting();
    }
}
