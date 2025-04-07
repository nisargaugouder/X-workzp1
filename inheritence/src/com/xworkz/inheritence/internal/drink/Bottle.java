package com.xworkz.inheritence.internal.drink;

public class Bottle {

    public void display(Drink drink) {
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();

        if(drink instanceof Juice) {
            System.out.println("drink instanceof Juice");
            Juice juice = (Juice) drink;
            juice.flavor();
        }
    }
}
