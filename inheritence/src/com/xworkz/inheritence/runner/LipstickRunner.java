package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.lipstick.Lipstick;
import com.xworkz.inheritence.internal.lipstick.MatteLipstick;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick = new MatteLipstick();
        lipstick.addsColor();
        lipstick.comesInDifferentShades();
        lipstick.madeOfWaxesAndOils();
        lipstick.enhancesBeauty();
        lipstick.usedForMakeup();

        System.out.println("-----------------");
        MatteLipstick matteLipstick = new MatteLipstick();
        matteLipstick.addsColor();
        matteLipstick.comesInDifferentShades();
        matteLipstick.madeOfWaxesAndOils();
        matteLipstick.enhancesBeauty();
        matteLipstick.usedForMakeup();
    }
}
