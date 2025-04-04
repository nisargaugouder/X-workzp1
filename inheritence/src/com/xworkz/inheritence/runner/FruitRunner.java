package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.fruit.Fruit;
import com.xworkz.inheritence.internal.fruit.Apple;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();
        fruit.seeds();

        System.out.println("-----------");

        Fruit fruit2 = new Apple();
        fruit2.taste();
        fruit2.color();
        fruit2.nutrients();
        fruit2.seasonal();
        fruit2.seeds();

        System.out.println("-----------");

        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();
        apple.seeds();
    }
}
