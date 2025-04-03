package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.milk.Milk;
import com.xworkz.inheritence.internal.milk.AlmondMilk;

public class MilkRunner {
    public static void main(String[] args) {
        Milk milk = new AlmondMilk();
        milk.provideCalcium();
        milk.usedInCooking();
        milk.boostImmunity();
        milk.consumedDaily();
        milk.availableInDifferentTypes();

        System.out.println("-----------------");
        AlmondMilk almondMilk = new AlmondMilk();
        almondMilk.provideCalcium();
        almondMilk.usedInCooking();
        almondMilk.boostImmunity();
        almondMilk.consumedDaily();
        almondMilk.availableInDifferentTypes();
    }
}
