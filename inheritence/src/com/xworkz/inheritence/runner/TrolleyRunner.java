package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.trolley.Trolley;
import com.xworkz.inheritence.internal.trolley.ShoppingTrolley;

public class TrolleyRunner {
    public static void main(String[] args) {
        Trolley trolley = new Trolley();
        trolley.carry();
        trolley.wheels();
        trolley.material();
        trolley.size();
        trolley.use();

        System.out.println("-----------");

        Trolley trolley2 = new ShoppingTrolley();
        trolley2.carry();
        trolley2.wheels();
        trolley2.material();
        trolley2.size();
        trolley2.use();

        System.out.println("-----------");

        ShoppingTrolley shoppingTrolley = new ShoppingTrolley();
        shoppingTrolley.carry();
        shoppingTrolley.wheels();
        shoppingTrolley.material();
        shoppingTrolley.size();
        shoppingTrolley.use();
    }
}
