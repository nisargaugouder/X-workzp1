package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.rose.Rose;
import com.xworkz.inheritence.internal.rose.RedRose;

public class RoseRunner {
    public static void main(String[] args) {
        Rose rose = new Rose();
        rose.fragrance();
        rose.colors();
        rose.decorate();
        rose.thorns();
        rose.love();

        System.out.println("-----------");

        Rose rose2 = new RedRose();
        rose2.fragrance();
        rose2.colors();
        rose2.decorate();
        rose2.thorns();
        rose2.love();

        System.out.println("-----------");

        RedRose redRose = new RedRose();
        redRose.fragrance();
        redRose.colors();
        redRose.decorate();
        redRose.thorns();
        redRose.love();
    }
}
