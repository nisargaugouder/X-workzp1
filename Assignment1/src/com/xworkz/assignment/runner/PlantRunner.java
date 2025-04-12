package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.plant.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Plant("Rose", 1.2, true);
        System.out.println(plant);
        System.out.println(plant.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(plant));

        Plant plant1 = new Plant("Tulip", 0.8, false);
        Plant plant2 = new Plant("Rose", 1.2, true);

        boolean same = plant1.equals(plant2);
        System.out.println("same: " + same);
    }
}
