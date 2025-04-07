package com.xworkz.inheritence.internal.continent;

public class ContinentShop {

    public void explore(Continent continent) {
        continent.countries();
        continent.population();
        continent.culture();
        continent.economy();
        continent.climate();

        if(continent instanceof Asia) {
            System.out.println("continent instanceof Asia");
            Asia asia = (Asia) continent;
            asia.famousFor();
        }
    }
}
