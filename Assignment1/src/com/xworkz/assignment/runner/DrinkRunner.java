package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.drink.Drink;

public class DrinkRunner {
    public static void main(String[] args) {
        Drink drink = new Drink("Orange Juice", 250, false);
        System.out.println(drink);
        System.out.println(drink.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(drink));

        Drink drink1 = new Drink("Orange Juice", 250, false);
        Drink drink2 = new Drink("Orange Juice", 250, false);

        boolean same = drink1.equals(drink2);
        System.out.println("same:" + same);
    }
}
