package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.appliance.Appliance;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance=new Appliance();
        System.out.println(appliance);
        System.out.println(new Appliance().hashCode());
        System.out.println("original HashCode:"+System.identityHashCode(appliance));
    }
}
