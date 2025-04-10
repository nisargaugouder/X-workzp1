package com.xworkz.assignment.internal.fruit;

public class Fruit {
    private String name;
    private String color;
    private double price;

    public Fruit(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{name=" + name + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FruitHashCode:"+super.hashCode());
        return 3669;
    }
}
