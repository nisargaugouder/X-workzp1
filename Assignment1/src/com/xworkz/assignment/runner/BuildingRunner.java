package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.building.Building;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building("Empire State", 102, "New York");
        System.out.println(building);
        System.out.println(building.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(building));

        Building building1 = new Building("Empire State", 102, "New York");
        Building building2 = new Building("Empire State", 102, "New York");

        boolean same = building1.equals(building2);
        System.out.println("same:" + same);
    }
}
