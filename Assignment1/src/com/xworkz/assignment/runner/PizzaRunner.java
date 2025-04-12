package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pizza.Pizza;

public class PizzaRunner {
    public static void main(String[] args) {
        String[] toppings = {"Cheese", "Tomato", "Olives"};
        Pizza pizza = new Pizza("Medium", "Thin Crust", toppings);
        System.out.println(pizza);
        System.out.println(pizza.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(pizza));

        String[] toppings1 = {"Cheese", "Tomato", "Olives"};
        String[] toppings2 = {"Cheese", "Tomato", "Olives"};

        Pizza pizza1 = new Pizza("Medium", "Thin Crust", toppings1);
        Pizza pizza2 = new Pizza("Medium", "Thin Crust", toppings2);

        boolean same = pizza1.equals(pizza2);
        System.out.println("same: " + same);
    }
}
