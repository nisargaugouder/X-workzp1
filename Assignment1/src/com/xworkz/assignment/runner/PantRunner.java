package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.pant.Pant;


public class PantRunner {
    public static void main(String[] args) {
        Pant pant=new Pant("LV","XS","Blue");
        System.out.println(pant);
        System.out.println(pant.hashCode());
        System.out.println("Original:"+System.identityHashCode(pant));



    }
}
