package com.xworkz.late.internal.pluto;

public class DwarfPlanetImpl implements Pluto {
    public DwarfPlanetImpl() {
        System.out.println("no-arg const DwarfPlanetImpl");
    }

    @Override
    public void orbit() {
        System.out.println("DwarfPlanetImpl is orbiting");
    }
}
