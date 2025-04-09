package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.plant.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Plant("Rose", 1.2, true);
        System.out.println(plant);
    }
}
