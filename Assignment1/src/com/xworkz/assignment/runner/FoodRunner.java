package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.food.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food("Pizza", 299.99, "Fast Food");
        System.out.println(food);
        System.out.println(food.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(food));

        Food food1 = new Food("Burger", 199.99, "Fast Food");
        Food food2 = new Food("Pizza", 299.99, "Fast Food");

        boolean same = food1.equals(food2);
        System.out.println("same: " + same);
    }
}
