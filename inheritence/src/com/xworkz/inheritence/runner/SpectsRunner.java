package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.spects.Spects;
import com.xworkz.inheritence.internal.spects.Sunglasses;

public class SpectsRunner {
    public static void main(String[] args) {
        Spects spects = new Sunglasses();
        spects.improvesVision();
        spects.hasLenses();
        spects.comesInFrames();
        spects.protectsEyes();
        spects.canBeCustomized();

        System.out.println("-----------------");
        Sunglasses sunglasses = new Sunglasses();
        sunglasses.improvesVision();
        sunglasses.hasLenses();
        sunglasses.comesInFrames();
        sunglasses.protectsEyes();
        sunglasses.canBeCustomized();
    }
}
