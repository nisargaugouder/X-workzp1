package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.mole.EarthMole;
import com.xworkz.application.inheritancetype.mole.WaterMole;

public class MoleRunner {
    public static void main(String[] args) {
        EarthMole earthMole = new EarthMole();
        earthMole.burrowDeep();
        earthMole.dig();

        WaterMole waterMole = new WaterMole();
        waterMole.digNearWater();
        waterMole.dig();
    }
}
