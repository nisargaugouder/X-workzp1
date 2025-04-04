package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.scissors.Scissors;
import com.xworkz.inheritence.internal.scissors.HairScissors;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors();
        scissors.cut();
        scissors.sharp();
        scissors.home();
        scissors.size();
        scissors.handle();

        System.out.println("-----------");

        Scissors scissors2 = new HairScissors();
        scissors2.cut();
        scissors2.sharp();
        scissors2.home();
        scissors2.size();
        scissors2.handle();

        System.out.println("-----------");

        HairScissors hairScissors = new HairScissors();
        hairScissors.cut();
        hairScissors.sharp();
        hairScissors.home();
        hairScissors.size();
        hairScissors.handle();
    }
}
