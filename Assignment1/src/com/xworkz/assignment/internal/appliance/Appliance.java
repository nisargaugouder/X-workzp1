package com.xworkz.assignment.internal.appliance;

public class Appliance {
    private String name;
    private int cost;
    private boolean costly;

    public Appliance(){
        System.out.println("no-arg cont Appliances");
        this.cost=40000;
        this.costly=true;
        this.name="Bajaj";
    }

    @Override
    public String toString() {
        return "Name:"+name + ",Cost:"+cost+",Costly:"+costly;
    }
}
