package com.xworkz.late.internal.moon;

public class SatelliteImpl implements Moon {
    public SatelliteImpl() {
        System.out.println("no-arg const SatelliteImpl");
    }

    @Override
    public void reflectLight() {
        System.out.println("SatelliteImpl reflects sunlight");
    }
}
