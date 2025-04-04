package com.xworkz.inheritence.internal.metal;

public class Metal {
    public Metal() {
        System.out.println("Metal --parent");
    }

    public void conduct() {
        System.out.println("Metal conducts electricity --parent");
    }

    public void durable() {
        System.out.println("Metal is highly durable --parent");
    }

    public void malleable() {
        System.out.println("Metal is malleable and can be shaped --parent");
    }

    public void dense() {
        System.out.println("Metal has a high density --parent");
    }

    public void resist() {
        System.out.println("Metal resists corrosion --parent");
    }
}
