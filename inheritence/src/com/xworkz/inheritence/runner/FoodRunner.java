package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.food.Food;
import com.xworkz.inheritence.internal.food.Burger;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Burger();
        food.eat();
        food.taste();
        food.cook();
        food.health();
        food.spice();

        System.out.println("--------------");
        Burger burger = new Burger();
        burger.eat();
        burger.taste();
        burger.cook();
        burger.health();
        burger.spice();
    }
}
