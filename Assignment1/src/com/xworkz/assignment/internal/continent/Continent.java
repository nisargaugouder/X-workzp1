package com.xworkz.assignment.internal.continent;

public class Continent {
    private String name;
    private int area;
    private int countries;

    public Continent(String name, int area, int countries) {
        this.name = name;
        this.area = area;
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", countries=" + countries +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ContinentHashCode:"+super.hashCode());
        return 754;
    }
}
