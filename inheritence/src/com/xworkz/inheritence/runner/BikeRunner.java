package com.xworkz.inheritence.runner.bike;

import com.xworkz.inheritence.internal.bike.Bike;
import com.xworkz.inheritence.internal.bike.SportsBike;

public class BikeRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bike ----------");
        Bike bike = new Bike();
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        System.out.println("---------- SportsBike ----------");
        Bike sportsBike = new SportsBike();
        sportsBike.transport();
        sportsBike.wheels();
        sportsBike.fuel();
        sportsBike.safety();
        sportsBike.model();

        System.out.println("---------- Direct SportsBike ----------");
        SportsBike directSportsBike = new SportsBike();
        directSportsBike.transport();
        directSportsBike.wheels();
        directSportsBike.fuel();
        directSportsBike.safety();
        directSportsBike.model();
    }
}
