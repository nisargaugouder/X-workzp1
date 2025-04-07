package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.flower.Beautiful;
import com.xworkz.inheritence.internal.flower.Flower;
import com.xworkz.inheritence.internal.flower.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower1 = new Rose();
        flower1.bloom();
        flower1.scent();
        flower1.shade();
        flower1.petals();
        flower1.pollinate();

        Flower flower = new Rose();
        flower.bloom();
        flower.scent();
        flower.shade();
        flower.petals();
        flower.pollinate();

        System.out.println("-----------");

        Rose rose = new Rose();
        rose.bloom();
        rose.scent();
        rose.shade();
        rose.petals();
        rose.pollinate();

        System.out.println("----------casting");
        Beautiful beautiful=new Beautiful();
        beautiful.colorFull(flower);
        beautiful.colorFull(rose);
        beautiful.colorFull(flower1);
    }
}
