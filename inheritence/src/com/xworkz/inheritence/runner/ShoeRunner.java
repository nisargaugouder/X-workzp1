package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.shoe.Shoe;
import com.xworkz.inheritence.internal.shoe.SportsShoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new SportsShoe();
        shoe.protectsFeet();
        shoe.providesComfort();
        shoe.comesInVariousStyles();
        shoe.madeFromDifferentMaterials();
        shoe.availableInDifferentSizes();

        System.out.println("-----------------");
        SportsShoe sportsShoe = new SportsShoe();
        sportsShoe.protectsFeet();
        sportsShoe.providesComfort();
        sportsShoe.comesInVariousStyles();
        sportsShoe.madeFromDifferentMaterials();
        sportsShoe.availableInDifferentSizes();
    }
}
