package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.mug.Mug;
import com.xworkz.inheritence.internal.mug.CoffeeMug;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new CoffeeMug();
        mug.usedForDrinking();
        mug.madeOfCeramic();
        mug.hasHandle();
        mug.comesInVariousDesigns();
        mug.canHoldHotLiquids();

        System.out.println("-----------------");
        CoffeeMug coffeeMug = new CoffeeMug();
        coffeeMug.usedForDrinking();
        coffeeMug.madeOfCeramic();
        coffeeMug.hasHandle();
        coffeeMug.comesInVariousDesigns();
        coffeeMug.canHoldHotLiquids();
    }
}
