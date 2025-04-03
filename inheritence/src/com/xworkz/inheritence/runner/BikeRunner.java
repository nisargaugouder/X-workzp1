package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bike.Bike;
import com.xworkz.inheritence.internal.bike.SportsBike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new SportsBike();
        bike.usedForTransportation();
        bike.hasTwoWheels();
        bike.runsOnFuel();
        bike.requiresHelmet();
        bike.comesInDifferentModels();

        System.out.println("-----------------");
        SportsBike sportsBike = new SportsBike();
        sportsBike.usedForTransportation();
        sportsBike.hasTwoWheels();
        sportsBike.runsOnFuel();
        sportsBike.requiresHelmet();
        sportsBike.comesInDifferentModels();
    }
}
