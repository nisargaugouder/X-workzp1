package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.band.Band;

public class BandRunner {
    public static void main(String[] args) {
        Band band = new Band();
        System.out.println(band);
        System.out.println(new Band().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(band));
    }
}
