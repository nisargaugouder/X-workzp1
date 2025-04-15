package com.xworkz.application.internal.ring;

public abstract class Ring {
    private String purpose;
    private int size;
    private double cost;
    private String material;

    public Ring(String purpose,int size,double cost,String material){
        this.material=material;
        this.cost=cost;
        this.size=size;
        this.purpose=purpose;
    }
    public Ring(String purpose,int size){
        this.purpose = purpose;
        this.size = size;
    }
    public Ring(double cost, String material) {
        this.cost = cost;
        this.material = material;
    }

}
