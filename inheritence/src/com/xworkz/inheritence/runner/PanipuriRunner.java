package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.panipuri.Panipuri;
import com.xworkz.inheritence.internal.panipuri.SpicyPanipuri;

public class PanipuriRunner {
    public static void main(String[] args) {
        Panipuri panipuri = new SpicyPanipuri();
        panipuri.popularStreetFood();
        panipuri.madeOfCrispyPuri();
        panipuri.comesWithVariety();
        panipuri.servedWithFilling();
        panipuri.bestEatenFresh();

        System.out.println("-----------------");
        SpicyPanipuri spicyPanipuri = new SpicyPanipuri();
        spicyPanipuri.popularStreetFood();
        spicyPanipuri.madeOfCrispyPuri();
        spicyPanipuri.comesWithVariety();
        spicyPanipuri.servedWithFilling();
        spicyPanipuri.bestEatenFresh();
    }
}
