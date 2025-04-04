package com.xworkz.inheritence.internal.apple;

public class GreenApple extends Apple {
    public GreenApple() {
        super();
        System.out.println("Running non-arg constructor GreenApple");
    }
    @Override
    public void taste() {
        System.out.println("Apple has a sweet and tangy taste--child");
    }
    @Override
    public void provideNutrition() {
        System.out.println("Apple provides essential nutrients--child");
    }
    @Override
    public void boostImmunity() {
        System.out.println("Apple helps in boosting immunity--child");
    }
    @Override
    public void availableInSeasons() {
        System.out.println("Apples are available in different seasons--child");
    }
    @Override
    public void usedInCooking() {
        System.out.println("Apple is used in making pies and juices--child");
    }
}
