package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.building.Building;
import com.xworkz.application.inheritancetype.building.Apartment;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building();
        Apartment apartment = new Apartment();

        building.provideShelter();
        apartment.rent();
        apartment.provideShelter();
    }
}
