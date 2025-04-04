package com.xworkz.inheritence.internal.sales;

public class Sales {
    public Sales() {
        System.out.println("Sales --parent");
    }

    public void revenue() {
        System.out.println("Sales generate revenue --parent");
    }

    public void marketing() {
        System.out.println("Sales involve marketing --parent");
    }

    public void customer() {
        System.out.println("Sales require customer engagement --parent");
    }

    public void discounts() {
        System.out.println("Sales include discounts --parent");
    }

    public void global() {
        System.out.println("Sales happen globally --parent");
    }
}
