package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.pig.Pig;
import com.xworkz.inheritence.internal.pig.WildPig;

public class PigRunner {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.eat();
        pig.live();
        pig.smell();
        pig.social();
        pig.smart();

        System.out.println("-----------");

        Pig pig2 = new WildPig();
        pig2.eat();
        pig2.live();
        pig2.smell();
        pig2.social();
        pig2.smart();

        System.out.println("-----------");

        WildPig wildPig = new WildPig();
        wildPig.eat();
        wildPig.live();
        wildPig.smell();
        wildPig.social();
        wildPig.smart();
    }
}
