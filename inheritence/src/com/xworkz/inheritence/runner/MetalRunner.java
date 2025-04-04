package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.metal.Metal;
import com.xworkz.inheritence.internal.metal.Gold;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Metal();
        metal.conduct();
        metal.durable();
        metal.malleable();
        metal.dense();
        metal.resist();

        System.out.println("-----------");

        Metal metal2 = new Gold();
        metal2.conduct();
        metal2.durable();
        metal2.malleable();
        metal2.dense();
        metal2.resist();

        System.out.println("-----------");

        Gold gold = new Gold();
        gold.conduct();
        gold.durable();
        gold.malleable();
        gold.dense();
        gold.resist();
    }
}
