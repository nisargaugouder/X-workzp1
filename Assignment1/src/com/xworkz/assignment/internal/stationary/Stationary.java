package com.xworkz.assignment.internal.stationary;

public class Stationary {
    private String item;
    private int price;
    private String brand;

    public Stationary(String item, int price, String brand) {
        this.item = item;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Stationary{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("StationaryHashCode:"+super.hashCode());
        return 51;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Stationary){
                System.out.println("obj instance of class");
                Stationary stationary1=this;
                Stationary stationary2=(Stationary) obj;
                if(stationary1.brand.equals(stationary2.brand) && stationary1.item.equals(stationary2.item) && stationary1.price==stationary2.price){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
