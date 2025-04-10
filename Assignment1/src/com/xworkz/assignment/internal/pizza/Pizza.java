package com.xworkz.assignment.internal.pizza;

public class Pizza {
    private String size;
    private String crustType;
    private String[] toppings;

    public Pizza(String size, String crustType, String[] toppings) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", toppings=" + String.join(", ", toppings) +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PizzaHashCode:"+super.hashCode());
        return 72;
    }
}
