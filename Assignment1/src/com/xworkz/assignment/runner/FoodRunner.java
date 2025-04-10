package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.food.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food("Pizza", 299.99, "Fast Food");
        System.out.println(food);
        System.out.println(food.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(food));
    }
}
