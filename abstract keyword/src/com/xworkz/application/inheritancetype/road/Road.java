package com.xworkz.application.inheritancetype.road;

public class Road extends Path {
    Traffic traffic = new Traffic();

    public void allowVehicles() {
        traffic.manage();
    }
}
