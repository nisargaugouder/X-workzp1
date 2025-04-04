package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.trolley.Trolley;
import com.xworkz.inheritence.internal.trolley.ShoppingTrolley;

public class TrolleyRunner {
    public static void main(String[] args) {
        Trolley trolley = new ShoppingTrolley();
        trolley.usedForCarryingItems();
        trolley.hasWheels();
        trolley.madeOfMetalOrPlastic();
        trolley.availableInDifferentSizes();
        trolley.commonlyUsedInSupermarkets();

        System.out.println("-----------------");
        ShoppingTrolley shoppingTrolley = new ShoppingTrolley();
        shoppingTrolley.usedForCarryingItems();
        shoppingTrolley.hasWheels();
        shoppingTrolley.madeOfMetalOrPlastic();
        shoppingTrolley.availableInDifferentSizes();
        shoppingTrolley.commonlyUsedInSupermarkets();
    }
}
