package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.hair.Hair;
import com.xworkz.inheritence.internal.hair.CurlyHair;

public class HairRunner {
    public static void main(String[] args) {
        Hair hair = new CurlyHair();
        hair.providesProtection();
        hair.growsNaturally();
        hair.canBeStyled();
        hair.requiresMaintenance();
        hair.madeOfKeratin();

        System.out.println("-----------------");
        CurlyHair curlyHair = new CurlyHair();
        curlyHair.providesProtection();
        curlyHair.growsNaturally();
        curlyHair.canBeStyled();
        curlyHair.requiresMaintenance();
        curlyHair.madeOfKeratin();
    }
}
