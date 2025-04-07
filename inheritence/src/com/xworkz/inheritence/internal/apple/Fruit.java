package com.xworkz.inheritence.internal.apple;

public class Fruit {
    public void eat(Apple apple){
        apple.availableInSeasons();
        apple.boostImmunity();
        apple.provideNutrition();
        apple.taste();
        apple.usedInCooking();

        if(apple instanceof GreenApple){
            System.out.println("apple instance of GreenApple");
            GreenApple greenApple=(GreenApple) apple;
            greenApple.slice();
        }
    }
}
