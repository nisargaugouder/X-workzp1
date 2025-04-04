package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.suit.Suit;
import com.xworkz.inheritence.internal.suit.WeddingSuit;

public class SuitRunner {
    public static void main(String[] args) {
        Suit suit = new Suit();
        suit.wear();
        suit.fabric();
        suit.style();
        suit.personality();
        suit.fitting();

        System.out.println("-----------");

        Suit suit2 = new WeddingSuit();
        suit2.wear();
        suit2.fabric();
        suit2.style();
        suit2.personality();
        suit2.fitting();

        System.out.println("-----------");

        WeddingSuit weddingSuit = new WeddingSuit();
        weddingSuit.wear();
        weddingSuit.fabric();
        weddingSuit.style();
        weddingSuit.personality();
        weddingSuit.fitting();
    }
}
