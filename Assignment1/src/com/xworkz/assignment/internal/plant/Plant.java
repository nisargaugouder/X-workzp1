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

    @Override
    public int hashCode() {
        System.out.println("PlantHashCode:"+super.hashCode());
        return 82;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Plant){
                System.out.println("obj instance of class");
                Plant plant1=this;
                Plant plant2=(Plant) obj;
                if(plant1.isFlowering==plant2.isFlowering && plant1.height==plant2.height && plant1.species.equals(plant2.species)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
