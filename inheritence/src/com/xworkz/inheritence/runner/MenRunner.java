package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.men.Men;
import com.xworkz.inheritence.internal.men.Gentleman;

public class MenRunner {
    public static void main(String[] args) {
        Men men = new Men();
        men.work();
        men.lead();
        men.dress();
        men.fit();
        men.social();

        System.out.println("-----------");

        Men men2 = new Gentleman();
        men2.work();
        men2.lead();
        men2.dress();
        men2.fit();
        men2.social();

        System.out.println("-----------");

        Gentleman gentleman = new Gentleman();
        gentleman.work();
        gentleman.lead();
        gentleman.dress();
        gentleman.fit();
        gentleman.social();
    }
}
