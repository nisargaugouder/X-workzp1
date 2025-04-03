package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pizza.Pizza;
import com.xworkz.inheritence.internal.pizza.CheesePizza;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza pizza = new CheesePizza();
        pizza.hasCrust();
        pizza.toppedWithSauce();
        pizza.includesCheese();
        pizza.availableInDifferentFlavors();
        pizza.cookedInOven();

        System.out.println("-----------------");
        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.hasCrust();
        cheesePizza.toppedWithSauce();
        cheesePizza.includesCheese();
        cheesePizza.availableInDifferentFlavors();
        cheesePizza.cookedInOven();
    }
}
