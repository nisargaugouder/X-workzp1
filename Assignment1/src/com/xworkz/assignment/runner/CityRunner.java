package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.city.City;

public class CityRunner {
    public static void main(String[] args) {
        City city = new City("Mysore", "Karnataka", 920000);
        System.out.println(city);
        System.out.println(city.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(city));
    }
}
