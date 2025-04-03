package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.earpods.Earpods;
import com.xworkz.inheritence.internal.earpods.WirelessEarpods;

public class EarpodsRunner {
    public static void main(String[] args) {
        Earpods earpods = new WirelessEarpods();
        earpods.playMusic();
        earpods.charge();
        earpods.connect();

        System.out.println("-----------------");
        WirelessEarpods wirelessEarpods = new WirelessEarpods();
        wirelessEarpods.playMusic();
        wirelessEarpods.charge();
        wirelessEarpods.connect();
    }
}
