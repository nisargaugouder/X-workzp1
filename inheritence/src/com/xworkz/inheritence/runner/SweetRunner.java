package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sweet.Sweet;
import com.xworkz.inheritence.internal.sweet.GulabJamun;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        sweet.taste();
        sweet.sugar();
        sweet.festival();
        sweet.store();
        sweet.gift();

        System.out.println("-----------");

        Sweet sweet2 = new GulabJamun();
        sweet2.taste();
        sweet2.sugar();
        sweet2.festival();
        sweet2.store();
        sweet2.gift();

        System.out.println("-----------");

        GulabJamun gulabJamun = new GulabJamun();
        gulabJamun.taste();
        gulabJamun.sugar();
        gulabJamun.festival();
        gulabJamun.store();
        gulabJamun.gift();
    }
}
