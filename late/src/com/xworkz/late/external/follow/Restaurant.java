package com.xworkz.late.external.follow;

import com.xworkz.late.internal.food.Food;

public class Restaurant {
    private Food food;

    public Restaurant(Food food) {
        this.food = food;
    }

    public void serve() {
        System.out.println("Running serve in Restaurant");
        if (this.food != null) {
            this.food.eat();
        } else {
            System.out.println("error");
        }
    }
}
