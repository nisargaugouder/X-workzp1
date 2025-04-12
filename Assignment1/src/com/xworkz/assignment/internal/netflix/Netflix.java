package com.xworkz.assignment.internal.netflix;

public class Netflix {
    private String plan;
    private int price;
    private int screens;

    public Netflix(String plan, int price, int screens) {
        this.plan = plan;
        this.price = price;
        this.screens = screens;
    }

    @Override
    public String toString() {
        return "Netflix{plan='" + plan + "', price=" + price + ", screens=" + screens + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("NetflixHashCode:"+super.hashCode());
        return 0;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Netflix){
                System.out.println("obj instance of class");
                Netflix netflix1=this;
                Netflix netflix2=(Netflix) obj;
                if(netflix2.plan.equals(netflix1.plan) && netflix1.price==netflix2.price && netflix1.screens==netflix2.screens){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
