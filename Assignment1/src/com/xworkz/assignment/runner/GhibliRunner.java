package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.ghibli.Ghibli;

public class GhibliRunner {
    public static void main(String[] args) {
        Ghibli ghibli = new Ghibli("Spirited Away", "Hayao Miyazaki", 2001);
        System.out.println(ghibli);
        System.out.println(ghibli.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(ghibli));

        Ghibli ghibli1 = new Ghibli("My Neighbor Totoro", "Hayao Miyazaki", 1988);
        Ghibli ghibli2 = new Ghibli("Spirited Away", "Hayao Miyazaki", 2001);
        boolean same = ghibli1.equals(ghibli2);
        System.out.println("same:" + same);
    }
}
