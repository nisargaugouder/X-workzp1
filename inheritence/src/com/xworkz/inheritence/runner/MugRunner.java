package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.mug.Mug;
import com.xworkz.inheritence.internal.mug.CoffeeMug;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new Mug();
        mug.drink();
        mug.material();
        mug.handle();
        mug.design();
        mug.hot();

        System.out.println("-----------");

        Mug mug2 = new CoffeeMug();
        mug2.drink();
        mug2.material();
        mug2.handle();
        mug2.design();
        mug2.hot();

        System.out.println("-----------");

        CoffeeMug coffeeMug = new CoffeeMug();
        coffeeMug.drink();
        coffeeMug.material();
        coffeeMug.handle();
        coffeeMug.design();
        coffeeMug.hot();
    }
}
