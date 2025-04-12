package com.xworkz.assignment.internal.car;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CarHashCode:"+super.hashCode());
        return 76;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Car){
                System.out.println("have ref.will compare..");
                Car car1=this;
                Car car2=(Car) obj;
                if(car1.brand.equals(car2.brand)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
