package com.xworkz.late.internal.earth;

public class BluePlanetImpl implements Earth {
    public BluePlanetImpl() {
        System.out.println("no-arg const BluePlanetImpl");
    }

    @Override
    public void supportLife() {
        System.out.println("BluePlanetImpl supports life");
    }
}
