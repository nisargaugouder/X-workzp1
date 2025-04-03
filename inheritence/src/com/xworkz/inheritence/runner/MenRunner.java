package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.men.Men;
import com.xworkz.inheritence.internal.men.Gentleman;

public class MenRunner {
    public static void main(String[] args) {
        Men men = new Gentleman();
        men.work();
        men.takeResponsibility();
        men.dressWell();
        men.stayFit();
        men.socialize();

        System.out.println("-----------------");
        Gentleman gentleman = new Gentleman();
        gentleman.work();
        gentleman.takeResponsibility();
        gentleman.dressWell();
        gentleman.stayFit();
        gentleman.socialize();
    }
}
