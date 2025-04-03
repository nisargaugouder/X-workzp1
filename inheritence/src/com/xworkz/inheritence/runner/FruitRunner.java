package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.fruit.Apple;
import com.xworkz.inheritence.internal.fruit.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit=new Apple();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();

        System.out.println("-----------");
        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();
    }
}
