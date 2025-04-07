package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.band.Band;
import com.xworkz.inheritence.internal.band.MusicBand;
import com.xworkz.inheritence.internal.band.RubberBand;
import com.xworkz.inheritence.internal.employee.Manager;

public class BandRunner {
    public static void main(String[] args) {
        Band band1 = new Band();
        band1.bind();
        band1.stretch();
        band1.size();
        band1.material();
        band1.use();

        System.out.println("-------------------");
        Band band = new RubberBand();
        band.bind();
        band.stretch();
        band.size();
        band.material();
        band.use();

        System.out.println("-----------------");
        RubberBand rubberBand = new RubberBand();
        rubberBand.bind();
        rubberBand.stretch();
        rubberBand.size();
        rubberBand.material();
        rubberBand.use();

        System.out.println("-------casting");
        MusicBand musicBand=new MusicBand();
        musicBand.Music(band1);
        musicBand.Music(band);
        musicBand.Music(rubberBand);
    }
}
