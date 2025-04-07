package com.xworkz.inheritence.internal.fruit;

public class Sweet {
    public void size(Fruit fruit){
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();
        fruit.seeds();

        if(fruit instanceof Apple){
            System.out.println("fruit instanceof Apple");
            Apple apple=(Apple) fruit;
            apple.grow();
        }
    }
}
