package com.xworkz.assignment.internal.frozenbottle;

public class FrozenBottle {
    private String flavor;
    private double price;
    private String type;

    public FrozenBottle(String flavor, double price, String type) {
        this.flavor = flavor;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "FrozenBottle{flavor=" + flavor + ", price=" + price + ", type=" + type + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FrozenHashCode:"+super.hashCode());
        return 85;
    }
}
