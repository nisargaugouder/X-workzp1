package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.band.Band;

public class BandRunner {
    public static void main(String[] args) {
        Band band = new Band();
        System.out.println(band);
        System.out.println(new Band().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(band));


        Band band1=new Band();
        band1.setGenre("horror");
        Band band2=new Band();
        band2.setGenre("comedy");
        boolean same=band1.equals(band2);
        System.out.println("same:"+same);



    }
}
