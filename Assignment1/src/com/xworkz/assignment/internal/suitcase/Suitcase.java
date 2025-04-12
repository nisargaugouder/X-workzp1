package com.xworkz.assignment.internal.suitcase;

public class Suitcase {
    private String brand;
    private double capacity;
    private boolean hasWheels;

    public Suitcase(String brand, double capacity, boolean hasWheels) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", hasWheels=" + hasWheels +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SuitcaseHashCode:"+super.hashCode());
        return 54;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Suitcase){
                System.out.println("obj instance of class");
                Suitcase suitcase1=this;
                Suitcase suitcase2=(Suitcase) obj;
                if(suitcase1.hasWheels==suitcase2.hasWheels && suitcase1.brand.equals(suitcase2.brand) && suitcase1.capacity==suitcase2.capacity){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
