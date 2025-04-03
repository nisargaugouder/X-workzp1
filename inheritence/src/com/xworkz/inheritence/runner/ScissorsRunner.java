package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.scissors.Scissors;
import com.xworkz.inheritence.internal.scissors.HairScissors;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new HairScissors();
        scissors.usedForCutting();
        scissors.hasSharpBlades();
        scissors.usedInHousehold();
        scissors.comesInDifferentSizes();
        scissors.requiresProperHandling();

        System.out.println("-----------------");
        HairScissors hairScissors = new HairScissors();
        hairScissors.usedForCutting();
        hairScissors.hasSharpBlades();
        hairScissors.usedInHousehold();
        hairScissors.comesInDifferentSizes();
        hairScissors.requiresProperHandling();
    }
}
