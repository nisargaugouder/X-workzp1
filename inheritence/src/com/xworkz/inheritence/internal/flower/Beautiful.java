package com.xworkz.inheritence.internal.flower;

public class Beautiful {
    public void colorFull(Flower flower){
        flower.bloom();
        flower.petals();
        flower.pollinate();
        flower.scent();
        flower.shade();

        if(flower instanceof Rose){
            System.out.println("flower instanceof Rose");
            Rose rose=(Rose) flower;
            rose.red();
        }
    }
}
