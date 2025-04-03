package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.building.Building;
import com.xworkz.inheritence.internal.building.House;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building=new House();
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();

        System.out.println("-----------");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();
    }
}
