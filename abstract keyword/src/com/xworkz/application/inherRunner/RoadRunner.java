package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.road.Road;

public class RoadRunner {
    public static void main(String[] args) {
        Road road = new Road();
        road.allowVehicles();
        road.lead();
    }
}
