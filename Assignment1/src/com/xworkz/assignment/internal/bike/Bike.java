package com.xworkz.assignment.internal.bike;

public class Bike {
    private String brand;
    private String model;
    private int engineCapacity;

    public Bike() {
        System.out.println("Running no-arg constructor of Bike");
        this.brand = "Yamaha";
        this.model = "YZF-R15";
        this.engineCapacity = 155;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Engine Capacity: " + engineCapacity + "cc";
    }

    @Override
    public int hashCode() {
        System.out.println("BikeHashCode:"+super.hashCode());
        return 46;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bike){
                System.out.println("have ref.will compare..");
                Bike bike1=this;
                Bike bike2=(Bike) obj;
                if(bike1.brand.equals(bike2.brand)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
