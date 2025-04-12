package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.umbrella.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Black", "Large", true);
        System.out.println(umbrella);
        System.out.println(umbrella.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(umbrella));

        Umbrella umbrella1=new Umbrella("Blue","XS",false);
        Umbrella umbrella2=new Umbrella("Black","XS",true);
        boolean same=umbrella1.equals(umbrella2);
        System.out.println("both are same:"+same);
    }
}
