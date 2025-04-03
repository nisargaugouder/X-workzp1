package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.rose.Rose;
import com.xworkz.inheritence.internal.rose.RedRose;

public class RoseRunner {
    public static void main(String[] args) {
        Rose rose = new RedRose();
        rose.hasFragrance();
        rose.comesInDifferentColors();
        rose.usedForDecoration();
        rose.hasThorns();
        rose.symbolizesLove();

        System.out.println("-----------------");
        RedRose redRose = new RedRose();
        redRose.hasFragrance();
        redRose.comesInDifferentColors();
        redRose.usedForDecoration();
        redRose.hasThorns();
        redRose.symbolizesLove();
    }
}
