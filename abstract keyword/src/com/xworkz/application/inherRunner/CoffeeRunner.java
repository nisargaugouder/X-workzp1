package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.coffee.Coffee;
import com.xworkz.application.inheritancetype.coffee.ColdCoffee;

public class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        ColdCoffee cold = new ColdCoffee();

        coffee.drink();
        cold.coolEffect();
        cold.drink();
    }
}
