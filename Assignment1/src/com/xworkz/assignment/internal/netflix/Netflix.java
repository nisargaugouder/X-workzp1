package com.xworkz.assignment.internal.netflix;

public class Netflix {
    private String plan;
    private int price;
    private int screens;

    public Netflix(String plan, int price, int screens) {
        this.plan = plan;
        this.price = price;
        this.screens = screens;
    }

    @Override
    public String toString() {
        return "Netflix{plan='" + plan + "', price=" + price + ", screens=" + screens + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("NetflixHashCode:"+super.hashCode());
        return 0;
    }
}
