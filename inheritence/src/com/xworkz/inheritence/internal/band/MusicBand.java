package com.xworkz.inheritence.internal.band;

public class MusicBand {
    public void Music(Band band){
        band.bind();
        band.size();
        band.use();
        band.stretch();
        band.material();

        if(band instanceof RubberBand){
            System.out.println("band instanceof RubberBand");
            RubberBand rubberBand=(RubberBand) band;
            rubberBand.streach();
        }
    }

}
