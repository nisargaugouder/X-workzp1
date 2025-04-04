package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.ocean.Ocean;
import com.xworkz.inheritence.internal.ocean.Pacific;

public class OceanRunner {
    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.depth();
        ocean.marineLife();
        ocean.waves();
        ocean.temperature();
        ocean.tides();

        System.out.println("-----------");

        Ocean ocean2 = new Pacific();
        ocean2.depth();
        ocean2.marineLife();
        ocean2.waves();
        ocean2.temperature();
        ocean2.tides();

        System.out.println("-----------");

        Pacific pacific = new Pacific();
        pacific.depth();
        pacific.marineLife();
        pacific.waves();
        pacific.temperature();
        pacific.tides();
    }
}
