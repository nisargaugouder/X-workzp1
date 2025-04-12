package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.city.City;

public class CityRunner {
    public static void main(String[] args) {
        City city = new City("Mysore", "Karnataka", 920000);
        System.out.println(city);
        System.out.println(city.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(city));

        City city1 = new City("Bangalore", "Karnataka", 12000000);
        City city2 = new City("Hubli", "Karnataka", 2000000);

        boolean same = city1.equals(city2);
        System.out.println("same:" + same);
    }
}
