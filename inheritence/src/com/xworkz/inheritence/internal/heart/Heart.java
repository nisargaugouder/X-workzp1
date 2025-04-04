package com.xworkz.inheritence.internal.heart;

public class Heart {
    public Heart() {
        System.out.println("Heart --parent");
    }

    public void pump() {
        System.out.println("Heart pumps blood --parent");
    }

    public void beat() {
        System.out.println("Heart beats continuously --parent");
    }

    public void oxygen() {
        System.out.println("Heart supplies oxygen --parent");
    }

    public void waste() {
        System.out.println("Heart removes waste --parent");
    }

    public void circulate() {
        System.out.println("Heart works in circulatory system --parent");
    }
}
