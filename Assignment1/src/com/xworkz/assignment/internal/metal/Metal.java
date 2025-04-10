package com.xworkz.assignment.internal.metal;

public class Metal {
    private String name;
    private String type;
    private int price;

    public Metal(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Metal{name='" + name + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MetalHashCode:"+super.hashCode());
        return 822;
    }
}
