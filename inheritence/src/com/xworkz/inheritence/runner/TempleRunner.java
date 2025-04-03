package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.temple.Temple;
import com.xworkz.inheritence.internal.temple.HinduTemple;

public class TempleRunner {
    public static void main(String[] args) {
        Temple temple = new HinduTemple();
        temple.worship();
        temple.meditate();
        temple.lightLamp();
        temple.offerPrayers();
        temple.ringBell();

        System.out.println("-----------------");
        HinduTemple hinduTemple = new HinduTemple();
        hinduTemple.worship();
        hinduTemple.meditate();
        hinduTemple.lightLamp();
        hinduTemple.offerPrayers();
        hinduTemple.ringBell();
    }
}
