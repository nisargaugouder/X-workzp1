package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.milk.Milk;
import com.xworkz.inheritence.internal.milk.AlmondMilk;

public class MilkRunner {
    public static void main(String[] args) {
        Milk milk = new Milk();
        milk.calcium();
        milk.cook();
        milk.immunity();
        milk.daily();
        milk.types();

        System.out.println("-----------");

        Milk milk2 = new AlmondMilk();
        milk2.calcium();
        milk2.cook();
        milk2.immunity();
        milk2.daily();
        milk2.types();

        System.out.println("-----------");

        AlmondMilk almondMilk = new AlmondMilk();
        almondMilk.calcium();
        almondMilk.cook();
        almondMilk.immunity();
        almondMilk.daily();
        almondMilk.types();
    }
}
