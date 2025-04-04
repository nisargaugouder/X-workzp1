package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.temple.Temple;
import com.xworkz.inheritence.internal.temple.HinduTemple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new Temple();
        temple.worship();
        temple.meditate();
        temple.lightLamp();
        temple.offerPrayers();
        temple.ringBell();

        System.out.println("-----------");

        Temple temple2 = new HinduTemple();
        temple2.worship();
        temple2.meditate();
        temple2.lightLamp();
        temple2.offerPrayers();
        temple2.ringBell();

        System.out.println("-----------");

        HinduTemple hinduTemple = new HinduTemple();
        hinduTemple.worship();
        hinduTemple.meditate();
        hinduTemple.lightLamp();
        hinduTemple.offerPrayers();
        hinduTemple.ringBell();
    }
}
