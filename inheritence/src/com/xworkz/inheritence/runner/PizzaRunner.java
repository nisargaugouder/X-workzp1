package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pizza.Pizza;
import com.xworkz.inheritence.internal.pizza.CheesePizza;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.crust();
        pizza.sauce();
        pizza.cheese();
        pizza.flavors();
        pizza.cook();

        System.out.println("-----------");

        Pizza pizza2 = new CheesePizza();
        pizza2.crust();
        pizza2.sauce();
        pizza2.cheese();
        pizza2.flavors();
        pizza2.cook();

        System.out.println("-----------");

        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.crust();
        cheesePizza.sauce();
        cheesePizza.cheese();
        cheesePizza.flavors();
        cheesePizza.cook();
    }
}
