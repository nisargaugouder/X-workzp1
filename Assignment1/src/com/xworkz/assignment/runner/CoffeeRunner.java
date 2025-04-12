package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.coffee.Coffee;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", "Medium", 150.0);
        System.out.println(coffee);
        System.out.println(coffee.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(coffee));

        Coffee coffee1 = new Coffee("Latte", "Large", 180.0);
        Coffee coffee2 = new Coffee("Cappuccino", "Small", 120.0);

        boolean same = coffee1.equals(coffee2);
        System.out.println("same:" + same);
    }
}
