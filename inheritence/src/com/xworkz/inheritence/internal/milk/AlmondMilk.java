package com.xworkz.inheritence.internal.milk;

public class AlmondMilk extends Milk {
    public AlmondMilk() {
        super();
        System.out.println("AlmondMilk --child");
    }

    @Override
    public void calcium() {
        System.out.println("Almond milk is a good source of calcium --child");
    }

    @Override
    public void cook() {
        System.out.println("Almond milk is used in vegan recipes --child");
    }

    @Override
    public void immunity() {
        System.out.println("Almond milk supports immunity with vitamin E --child");
    }

    @Override
    public void daily() {
        System.out.println("Almond milk is a daily dairy alternative --child");
    }

    @Override
    public void types() {
        System.out.println("Almond milk comes in various flavors --child");
    }
}
