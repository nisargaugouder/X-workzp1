package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.band.Band;
import com.xworkz.inheritence.internal.band.RubberBand;

public class BandRunner {
    public static void main(String[] args) {
        Band band = new RubberBand();
        band.usedForBinding();
        band.madeOfElasticMaterial();
        band.availableInDifferentSizes();
        band.stretchesEasily();
        band.usedForVariousPurposes();

        System.out.println("-----------------");
        RubberBand rubberBand = new RubberBand();
        rubberBand.usedForBinding();
        rubberBand.madeOfElasticMaterial();
        rubberBand.availableInDifferentSizes();
        rubberBand.stretchesEasily();
        rubberBand.usedForVariousPurposes();
    }
}
