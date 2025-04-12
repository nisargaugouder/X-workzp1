package com.xworkz.assignment.internal.milk;

public class Milk {
    private String brand;
    private String type;
    private int price;

    public Milk(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MilkHashCode:"+super.hashCode());
        return 236;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Milk){
                System.out.println("obj instance of class");
                Milk milk1=this;
                Milk milk2=(Milk) obj;
                if(milk1.brand.equals(milk2.brand) && milk1.type.equals(milk2.type) && milk1.price==milk2.price){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
