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

    @Override
    public int hashCode() {
        System.out.println("ApplHashCode:"+super.hashCode());
        return 741;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCostly(boolean costly) {
        this.costly = costly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Appliance){
                System.out.println("have ref.will compare..");
                Appliance appliance1=this;
                Appliance appliance2=(Appliance) obj;
                if(appliance1.costly==appliance2.costly){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
