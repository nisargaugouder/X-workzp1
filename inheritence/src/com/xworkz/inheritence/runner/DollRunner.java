package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.doll.Doll;
import com.xworkz.inheritence.internal.doll.BarbieDoll;

public class DollRunner {
    public static void main(String[] args) {
        Doll doll = new BarbieDoll();
        doll.play();
        doll.dressUp();
        doll.talk();
        doll.move();
        doll.collect();

        System.out.println("-----------------");
        BarbieDoll barbieDoll = new BarbieDoll();
        barbieDoll.play();
        barbieDoll.dressUp();
        barbieDoll.talk();
        barbieDoll.move();
        barbieDoll.collect();
    }
}
