package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pizza.Pizza;

public class PizzaRunner {
    public static void main(String[] args) {
        String[] toppings = {"Cheese", "Tomato", "Olives"};
        Pizza pizza = new Pizza("Medium", "Thin Crust", toppings);
        System.out.println(pizza);
        System.out.println(pizza.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(pizza));
    }
}
