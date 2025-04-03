package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.beverage.Beverage;
import com.xworkz.inheritence.internal.beverage.Coffee;

public class BeverageRunner {
    public static void main(String[] args) {
        Beverage beverage=new Coffee();
        beverage.drink();
        beverage.temperature();
        beverage.flavor();
        beverage.refresh();

        System.out.println("-----------");
        Coffee coffee = new Coffee();
        coffee.drink();
        coffee.temperature();
        coffee.flavor();
        coffee.refresh();
    }
}
