package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.coffee.Coffee;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Espresso", "Medium", 150.0);
        System.out.println(coffee);
        System.out.println(coffee.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(coffee));
    }
}
