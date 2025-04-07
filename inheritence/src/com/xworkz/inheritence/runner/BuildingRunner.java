package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.building.Building;
import com.xworkz.inheritence.internal.building.House;
import com.xworkz.inheritence.internal.building.Pg;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building1 = new Building();
        building1.shelter();
        building1.structure();
        building1.floors();
        building1.foundation();
        building1.rooms();

        System.out.println("-------------------");
        Building building = new House();
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();
        building.rooms();

        System.out.println("-------------------");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();
        house.rooms();

        System.out.println("------casting");
        Pg pg=new Pg();
        pg.ladies(building);
        pg.ladies(building1);
        pg.ladies(house);
    }
}
