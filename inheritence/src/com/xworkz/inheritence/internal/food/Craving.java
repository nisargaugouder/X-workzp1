package com.xworkz.inheritence.internal.food;

public class Craving {
    public void costly(Food food){
        food.eat();
        food.cook();
        food.taste();
        food.health();
        food.spice();

        if(food instanceof Burger){
            System.out.println("food instanceof Burger");
            Burger burger=(Burger) food;
            burger.full();
        }
    }
}
