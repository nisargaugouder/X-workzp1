package com.xworkz.assignment.internal.drink;

public class Drink {
    private String name;
    private int volume;
    private boolean isAlcoholic;

    public Drink(String name, int volume, boolean isAlcoholic) {
        this.name = name;
        this.volume = volume;
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", isAlcoholic=" + isAlcoholic +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("DrinkHashCode:"+super.hashCode());
        return 5451;
    }
}
