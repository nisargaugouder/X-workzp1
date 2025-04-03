package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.wine.Wine;
import com.xworkz.inheritence.internal.wine.RedWine;

public class WineRunner {
    public static void main(String[] args) {
        Wine wine = new RedWine();
        wine.madeFromGrapes();
        wine.containsAlcohol();
        wine.improvesWithAge();
        wine.servedInGlasses();
        wine.usedInCooking();

        System.out.println("-----------------");
        RedWine redWine = new RedWine();
        redWine.madeFromGrapes();
        redWine.containsAlcohol();
        redWine.improvesWithAge();
        redWine.servedInGlasses();
        redWine.usedInCooking();
    }
}
