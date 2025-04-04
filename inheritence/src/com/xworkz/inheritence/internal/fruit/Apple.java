package com.xworkz.inheritence.internal.fruit;

public class Apple extends Fruit {
    public Apple() {
        super();
        System.out.println("Apple --child");
    }

    @Override
    public void taste() {
        System.out.println("Apples are sweet --child");
    }

    @Override
    public void color() {
        System.out.println("Apples are mostly red --child");
    }

    @Override
    public void nutrients() {
        System.out.println("Apples contain fiber and vitamins --child");
    }

    @Override
    public void seasonal() {
        System.out.println("Apples are available year-round --child");
    }

    @Override
    public void seeds() {
        System.out.println("Apples have small seeds inside --child");
    }
}
