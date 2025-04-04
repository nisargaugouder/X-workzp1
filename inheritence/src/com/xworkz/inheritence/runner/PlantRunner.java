package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.plant.Plant;
import com.xworkz.inheritence.internal.plant.Flower;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.grow();
        plant.photo();
        plant.absorb();
        plant.oxygen();
        plant.reproduce();

        System.out.println("-----------");

        Plant plant2 = new Flower();
        plant2.grow();
        plant2.photo();
        plant2.absorb();
        plant2.oxygen();
        plant2.reproduce();

        System.out.println("-----------");

        Flower flower = new Flower();
        flower.grow();
        flower.photo();
        flower.absorb();
        flower.oxygen();
        flower.reproduce();
    }
}
