package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bed.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed();
        System.out.println(bed);
        System.out.println(new Bed().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bed));

        Bed bed1=new Bed();
        bed1.setSize("Xs");
        Bed bed2=new Bed();
        bed2.setSize("XL");
        boolean same=bed1.equals(bed2);
        System.out.println("same:"+same);
    }
}
