package com.xworkz.inheritence.internal.city;

public class Mayor {

    public void manageCity(City city) {
        city.people();
        city.roads();
        city.visit();
        city.life();
        city.business();

        if (city instanceof NewYork) {
            System.out.println("city instanceof NewYork");
            NewYork newYork = (NewYork) city;
            newYork.statueOfLiberty();
        }
    }
}
