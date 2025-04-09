package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.building.Building;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building("Empire State", 102, "New York");
        System.out.println(building);
    }
}
