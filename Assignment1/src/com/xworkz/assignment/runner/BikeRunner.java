package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bike.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike);
        System.out.println(new Bike().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bike));

        Bike bike1=new Bike();
        bike1.setBrand("Honda");
        Bike bike2=new Bike();
        bike2.setBrand("Royal Enfield");
        boolean same=bike1.equals(bike2);
        System.out.println("same:"+same);
    }
}
