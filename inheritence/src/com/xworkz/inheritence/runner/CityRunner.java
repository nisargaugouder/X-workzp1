package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.city.City;
import com.xworkz.inheritence.internal.city.NewYork;

public class CityRunner {
    public static void main(String[] args) {
        City city1 = new City();
        city1.people();
        city1.roads();
        city1.visit();
        city1.life();
        city1.business();

        System.out.println("-----------");

        City city = new NewYork();
        city.people();
        city.roads();
        city.visit();
        city.life();
        city.business();

        System.out.println("-----------");

        NewYork newYork = new NewYork();
        newYork.people();
        newYork.roads();
        newYork.visit();
        newYork.life();
        newYork.business();
    }
}
