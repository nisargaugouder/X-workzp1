package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.umbrella.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Black", "Large", true);
        System.out.println(umbrella);
        System.out.println(umbrella.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(umbrella));
    }
}
