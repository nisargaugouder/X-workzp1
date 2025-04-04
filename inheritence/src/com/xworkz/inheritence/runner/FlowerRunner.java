package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.flower.Flower;
import com.xworkz.inheritence.internal.flower.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
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
    }
}
