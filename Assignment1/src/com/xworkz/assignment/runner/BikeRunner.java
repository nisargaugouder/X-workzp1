package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bike.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println(bike);
        System.out.println(new Bike().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bike));
    }
}
