package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sweet.Sweet;
import com.xworkz.inheritence.internal.sweet.GulabJamun;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new GulabJamun();
        sweet.taste();
        sweet.madeWithSugar();
        sweet.serveInFestivals();
        sweet.store();
        sweet.giftToOthers();

        System.out.println("-----------------");
        GulabJamun gulabJamun = new GulabJamun();
        gulabJamun.taste();
        gulabJamun.madeWithSugar();
        gulabJamun.serveInFestivals();
        gulabJamun.store();
        gulabJamun.giftToOthers();
    }
}
