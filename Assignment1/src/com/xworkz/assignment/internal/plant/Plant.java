package com.xworkz.assignment.internal.plant;

public class Plant {
    private String species;
    private double height;
    private boolean isFlowering;

    public Plant(String species, double height, boolean isFlowering) {
        this.species = species;
        this.height = height;
        this.isFlowering = isFlowering;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "species='" + species + '\'' +
                ", height=" + height +
                ", isFlowering=" + isFlowering +
                '}';
    }
}
