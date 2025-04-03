package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.apple.Apple;
import com.xworkz.inheritence.internal.apple.GreenApple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple = new GreenApple();
        apple.taste();
        apple.provideNutrition();
        apple.boostImmunity();
        apple.availableInSeasons();
        apple.usedInCooking();

        System.out.println("-----------------");
        GreenApple greenApple = new GreenApple();
        greenApple.taste();
        greenApple.provideNutrition();
        greenApple.boostImmunity();
        greenApple.availableInSeasons();
        greenApple.usedInCooking();
    }
}
