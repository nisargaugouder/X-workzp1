package com.xworkz.inheritence.internal.bike;

public class Garage {

    public void park(Bike bike) {
        bike.transport();
        bike.wheels();
        bike.fuel();
        bike.safety();
        bike.model();

        if (bike instanceof SportsBike) {
            System.out.println("bike instance of SportsBike");
            SportsBike sportsBike = (SportsBike) bike;
            sportsBike.stunts();
        }
    }
}
