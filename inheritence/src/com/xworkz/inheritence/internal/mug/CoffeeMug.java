package com.xworkz.inheritence.internal.mug;

public class CoffeeMug extends Mug {
    public CoffeeMug() {
        super();
        System.out.println("CoffeeMug --child");
    }

    @Override
    public void drink() {
        System.out.println("CoffeeMug is perfect for drinking coffee --child");
    }

    @Override
    public void material() {
        System.out.println("CoffeeMug is made of thick ceramic --child");
    }

    @Override
    public void handle() {
        System.out.println("CoffeeMug has a comfortable handle --child");
    }

    @Override
    public void design() {
        System.out.println("CoffeeMug has stylish designs --child");
    }

    @Override
    public void hot() {
        System.out.println("CoffeeMug retains heat well --child");
    }
}
