package com.xworkz.inheritence.runner.bike;

import com.xworkz.inheritence.internal.bike.Bike;
import com.xworkz.inheritence.internal.bike.SportsBike;
import com.xworkz.inheritence.internal.bike.Garage;

public class BikeRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bike ----------");
        Bike bike1 = new Bike();
        bike1.transport();
        bike1.wheels();
        bike1.fuel();
        bike1.safety();
        bike1.model();

        System.out.println("---------- SportsBike ----------");
        Bike bike = new SportsBike();
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        System.out.println("---------- Direct SportsBike ----------");
        SportsBike sportsBike = new SportsBike();
        sportsBike.transport();
        sportsBike.wheels();
        sportsBike.fuel();
        sportsBike.safety();
        sportsBike.model();

        System.out.println("-------casting example------------");
        Garage garage = new Garage();
        garage.park(bike);
        garage.park(bike1);
        garage.park(sportsBike);
    }
}
